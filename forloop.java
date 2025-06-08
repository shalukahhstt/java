import java.util.Scanner;

public class forloop {
    public static void main(String[] args) throws InterruptedException {

        // for loop = execute some code a CERTAIN amount of times

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000); // do the iterartion after 1000 millis
        }

        System.out.println("HAPPY NEW YEAR!");

        scanner.close();
    }
}

