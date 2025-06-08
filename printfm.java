//import java.util.Scanner;
public class printfm {
    public static void main(String[] args) {
        String name = "Sponge Bob";
        char c = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        // these %s,%c,%d,%f,%b decide the place of printing the variable
        System.out.printf("You are %s\n", name);
        System.out.printf("You are %c\n", c);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f cm tall\n", height);
        System.out.printf("You are Employed :%b\n", isEmployed);

        System.out.printf("You are %s , You are %d years old",name,age);
    }
    
}
