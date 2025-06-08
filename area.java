import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        
        Double h = 0.0;
        Double w = 0.0;
        Double a = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height :");
        h = scanner.nextDouble();

        System.out.print("Enter the width :");
        w = scanner.nextDouble();

        a = w*h;

        System.out.println("Area is : " + a + " cm^2");
        
        scanner.close();
        
        
    }
}
