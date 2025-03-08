import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hi! Welcome to task manager. What task do you want to manage?");
        Scanner keyboard = new Scanner(System.in);
        String task = keyboard.nextLine();
        ArrayList<String> manager = new ArrayList<>();
        manager.add(task);

        while (!task.equals("n")) {
            for (int i = 0; i < manager.size(); i++) {
                System.out.println(manager.get(i) + " is at index " + i);
            }

            System.out.println("Do you want to continue? (y/n)");
            task = keyboard.nextLine();

            if (task.equals("y")) {
                System.out.println("Would you like to add or remove a task?");
                String action = keyboard.nextLine();

                if (action.equals("add")) {
                    System.out.println("What task would you like to add?");
                    task = keyboard.nextLine();
                    manager.add(task);
                } else if (action.equals("remove")) {
                    System.out.println("What would you like to remove?");
                    task = keyboard.nextLine();
                    for (int i = 0; i < manager.size(); i++) {
                        if (manager.get(i).equals(task)) {
                            manager.remove(i);
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("Thank you for using the Task Manager app!");
    }
}
