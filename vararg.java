//import java.util.Scanner;
public class vararg {
    public static void main(String[] args) {
        
        double number = add(1,2,3,4);
        System.out.println(number);
    }

    static double add(double... numbers){
        double sum=0;
        for(double num : numbers){
            sum += num;
        }
        return sum;
    }
}
