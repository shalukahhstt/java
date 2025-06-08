import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Can also use as try(Scanner scanner = new Scanner(System.in)){} which close scanner after executing automatically
        try{
            System.out.print("Enter a number :");
            int n = scanner.nextInt();
            System.out.println(n/0);
        }
        catch(InputMismatchException e){
            System.out.println("It's not a number");
        }
        catch(ArithmeticException e){
            System.out.println("Can't Divide By Zero");
        }
        catch(Exception e){
            //SAFETY NET
            System.out.println("Error");
        }
        finally{
            //Always execute regardless of the error
            System.out.println("Always come here");
            scanner.close();
        }

        
    }
}