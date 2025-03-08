import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pick difficulty: Easy(e), Normal(n), Hard(h)");
        String input1 = input.nextLine();

        String[] easy = {"Which planet is known as the Red Planet? ", "How many kings on a chess board? ", "What is our galaxy named? "};
        ArrayList<String> easyList = new ArrayList<>();
        String[] easyAnswer = {"1) Mars, 2) Saturn, 3) Venus, 4) Jupiter", "1) 2, 2) 3, 3) 4, 4) 1", "1) Milk Bear, 2) Milky Moo, 3) Milky Baby, 4) Milky Way"};
        ArrayList<String> easyAnswerList = new ArrayList<>();

        String[] normal = {"Who painted the Mona Lisa?", "Which gas makes up most of the Earth's atmosphere?", "In which year did the Titanic sink?"};
        ArrayList<String> normalList = new ArrayList<>();
        String[] normalAnswer = {"1) Leonardo da Vinci, 2) Pablo Picasso, 3) Vincent van Gogh, 4) Claude Monet", "1) Nitrogen, 2) Oxygen, 3) Carbon Dioxide, 4) Hydrogen", "1) 1900, 2) 1912, 3) 1925, 4) 1930"};
        ArrayList<String> normalAnswerList = new ArrayList<>();

        String[] hard = {"What is the chemical formula for methane?", "Who was the first woman to win a Nobel Prize?", "What is the capital city of Australia?"};
        ArrayList<String> hardList = new ArrayList<>();
        String[] hardAnswer = {"1) CH4, 2) C2H6, 3) CO2, 4) CH3", "1) Marie Curie, 2) Ada Lovelace, 3) Rosalind Franklin, 4) Elizabeth Blackwell", "1) Sydney, 2) Melbourne, 3) Canberra, 4) Adelaide"};
        ArrayList<String> hardAnswerList = new ArrayList<>();

        for (String question : easy) { easyList.add(question); }
        for (String question1 : easyAnswer) { easyAnswerList.add(question1); }
        for (String question : normal) { normalList.add(question); }
        for (String question1 : normalAnswer) { normalAnswerList.add(question1); }
        for (String question : hard) { hardList.add(question); }
        for (String question1 : hardAnswer) { hardAnswerList.add(question1); }

        int point = 0;

        while (easyList.size() != 0 || normalList.size() != 0 || hardList.size() != 0) {
            if (input1.equals("e") && easyList.size() != 0) {
                int easyRan = (int) (Math.random() * easyList.size());
                System.out.println(easyList.get(easyRan));
                System.out.println(easyAnswerList.get(easyRan));
                String easyList1 = easyList.remove(easyRan);
                String easyAnswerList1 = easyAnswerList.remove(easyRan);
                int easyInput = input.nextInt();
                if (easyList1.equals("Which planet is known as the Red Planet? ") && easyInput == 1) {
                    System.out.println("Correct, the answer is Mars");
                    point++;
                } else if (easyList1.equals("How many kings on a chess board? ") && easyInput == 1) {
                    System.out.println("Correct, the answer is 2");
                    point++;
                } else if (easyList1.equals("What is our galaxy named? ") && easyInput == 4) {
                    System.out.println("Correct, the answer is Milky Way");
                    point++;
                } else {
                    System.out.println("Wrong");
                }
            } else if (input1.equals("n") && normalList.size() != 0) {
                int normalRan = (int) (Math.random() * normalList.size());
                System.out.println(normalList.get(normalRan));
                System.out.println(normalAnswerList.get(normalRan));
                String normalList1 = normalList.remove(normalRan);
                String normalAnswerList1 = normalAnswerList.remove(normalRan);
                int normalInput = input.nextInt();
                if (normalList1.equals("Who painted the Mona Lisa?") && normalInput == 1) {
                    System.out.println("Correct, the answer is Leonardo da Vinci");
                    point++;
                } else if (normalList1.equals("Which gas makes up most of the Earth's atmosphere?") && normalInput == 1) {
                    System.out.println("Correct, the answer is Nitrogen");
                    point++;
                } else if (normalList1.equals("In which year did the Titanic sink?") && normalInput == 2) {
                    System.out.println("Correct, the answer is 1912");
                    point++;
                } else {
                    System.out.println("Wrong");
                }
            } else if (input1.equals("h") && hardList.size() != 0) {
                int hardRan = (int) (Math.random() * hardList.size());
                System.out.println(hardList.get(hardRan));
                System.out.println(hardAnswerList.get(hardRan));
                String hardList1 = hardList.remove(hardRan);
                String hardAnswerList1 = hardAnswerList.remove(hardRan);
                int hardInput = input.nextInt();
                if (hardList1.equals("What is the chemical formula for methane?") && hardInput == 1) {
                    System.out.println("Correct, the answer is CH4");
                    point++;
                } else if (hardList1.equals("Who was the first woman to win a Nobel Prize?") && hardInput == 1) {
                    System.out.println("Correct, the answer is Marie Curie");
                    point++;
                } else if (hardList1.equals("What is the capital city of Australia?") && hardInput == 3) {
                    System.out.println("Correct, the answer is Canberra");
                    point++;
                } else {
                    System.out.println("Wrong");
                }
            } else {
                break;
            }
        }
        System.out.println("You got " + point + " correct!");
    }
}


