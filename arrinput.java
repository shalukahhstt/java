import java.util.Scanner;
//import java.util.Arrays;

public class arrinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[3];

        for(int i =0; i < arr.length; i++){
            System.out.print("Enter a element :");
            arr[i] = scanner.nextLine();
        }
        scanner.close();

        for(int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
