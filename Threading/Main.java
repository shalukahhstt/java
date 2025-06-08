import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        // Threading = Allows a program to run multiple tasks simultaneously
        //                       Helps improve performance with time-consuming operations
        //                      (File I/O, network communications, or any background tasks)

        // How to create a Thread
        // Option 1. Extend the Thread class (simpler)
        // Option 2. Implement the Runnable interface (better)

        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true); // At 1st even if we type name it gives time is up we can fix thi9s by making this daemon
        thread.start();

        System.out.println("You have 5s to enter your name");
        System.out.println("Enter your name :");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();

        
    }
}