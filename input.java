import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your NAme :");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.print("Enter Your Age :");
        int age = scanner.nextInt();
        System.out.println("You are " + age);

        // for double nextDouble, for boolean nextBoolean



        scanner.close();
    }
}
