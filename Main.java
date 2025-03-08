import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        double nums = 0;
        double total = 0;
        ArrayList<Double> list = new ArrayList<Double>();
        while (nums != -1) {
            System.out.println("Click -1 to finish putting the grade");
            System.out.println("Click -2 to remove the grade that you want to remove");
            System.out.println("enter your grade:");
            double num = input.nextInt();
            nums = num;
            if ( num == -2){
                System.out.println("in order from 1 to..., which number you want to remove?");
                System.out.println("Grade list: "+list);
                int pick =  input.nextInt();
                if(pick < list.size() && pick != 0){
                    System.out.println(list.get(pick-1)+ " been removed");
                    list.remove(pick-1);

                }else{
                    System.out.println("undefined");
                }
            }
            if (num >= 0 && num <= 100) {
                list.add(num);


            }
            System.out.println("Grade list: "+list);


        }
        for (int i = 0; i < list.size(); i++) {
            for (int e = 0; e < list.size(); e++) {
                total += list.get(e);
            }
            double check = list.get(i);


        }
        double mean = (double) total / list.size() / list.size();
        System.out.println("Mean grade: " + mean+"%");
        //for (int i = 0; i < list.size(); i++) {
          //  if (list.get(i) < mean) {
           //     System.out.println("Grade of " + list.get(i) + " below avr");
         //   }
       // }
        double largest = 0;
        for (int i = 0; i < list.size(); i++) {
            if ( list.get(i)> largest){
                largest = list.get(i);
            }
        }
        System.out.println("Highest grade is: "+ largest+"%");
        double lowest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if ( list.get(i)< lowest){
                lowest = list.get(i);
            }
        }
        System.out.println("Lowest grade is: "+ lowest+"%");
        for (int i = 0; i < list.size(); i++) {
        if(list.get(i)>= 60){
            System.out.println("Pass: "+ list.get(i)+"%");
        }else if(list.get(i)< 60){
            System.out.println("Failed: "+ list.get(i)+"%");
        }
        }
    }
}
