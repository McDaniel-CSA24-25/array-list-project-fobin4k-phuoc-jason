import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Books CU = new Books("Captain Underpants", "Pilkey", true);
        Books HP = new Books("Hairy Porter", "J.K Rolling", true);
        Books SC = new Books("The Starving Caterpillar", "Elrac", true);
        Books BL = new Books("Sodium Hypochlorite", "Cube", true);
        ArrayList<Books> available = new ArrayList<>();
        ArrayList<Books> taken = new ArrayList<>();
        available.add(CU);
        available.add(HP);
        available.add(SC);
        available.add(BL);
        System.out.println("Hi! Welcome to the library");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What would you like to check out today?");
        for (Books b : available) {
            System.out.println(b.title + " by " + b.author);
        }
        String borrow = keyboard.nextLine();
        for(int i = 0; i < available.size(); i++) {
            if (borrow.equalsIgnoreCase(available.get(i).getTitle())) {
                available.get(i).setIsAvailable(false);
                taken.add(available.get(i));
            }
        }
        while (!(borrow.equals("n"))) {
            for (Books b : available) {
                if(b.isAvailable) {
                    System.out.println(b.title + " by " + b.author);
                }
            }
            System.out.println("Would like to check out another book? y/n");
            borrow = keyboard.nextLine();
            if(borrow.equals("y")) {
                System.out.println("What would you like to check out?");
                for (Books b : available) {
                    if (b.isAvailable) {
                        System.out.println(b.title + " by " + b.author);
                    }
                }
                borrow = keyboard.nextLine();
                for (int i = 0; i < available.size(); i++) {
                    if (borrow.equalsIgnoreCase(available.get(i).getTitle())) {
                        available.get(i).setIsAvailable(false);
                        taken.add(available.get(i));
                    }
                }
            }
        }
        System.out.println("Thank you for your time!");
        System.out.println("In Your Bag:");
        for (Books b : taken) {
            System.out.println(b.title + " by " + b.author);
        }
        System.out.println("Library:");
        for (Books b : available) {
            System.out.println(b.title + " by " + b.author);
            if (b.isAvailable) {
                System.out.println("Available for checkout");
            } else {
                System.out.println("Checked out");
            }
        }
    }
}

