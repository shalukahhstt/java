import java.util.Scanner;

public class switches {
    public static void main(String[] args) {

        // Enhanced switch = A replacement to many else if statements
        //                                   (Java14 feature)
        Scanner scanner = new Scanner(System.in);
        String day;
        System.out.print("Enter a day: ");
        day = scanner.nextLine();

        switch (day) {
            case "Monday" , "Tuesday", "wednesday","Thursday","Friday":
                System.out.println("Its a Weekday");
                break;
            case "Sunday" , "Saturday":
                System.out.println("Its a Weekend");
                break;
            default:
                System.out.println("Its not a Weekday");
                break;
        }
        scanner.close();
    }
}