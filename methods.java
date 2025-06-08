//import java.util.Scanner;
public class methods {
    public static void main(String[] args) {

        int age = 3;
        String name = "ADKhsjkd";

        birthday(name,age);

        double number = 3.0;

        number = square(number);
        System.out.println(number);

        // Overload methods
        System.out.println(add(1, 2));
        System.out.println(add(1, 2,3));
        

    }

    static void birthday(String name, int age){
        
        System.out.printf("Happy Birthday %s ! You are %d Years Old!\n",name,age);
    }
    
    static double square(double num){
        return num*num;
    }

    //overload methods 
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    
}
