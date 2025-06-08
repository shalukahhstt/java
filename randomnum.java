import java.util.Random;
public class randomnum {
    public static void main(String[] args) {
        Random random = new Random();
        int n;
        int n1;
        double n2;
        n = random.nextInt(1,100);
        n1 = random.nextInt(1,100);
        n2 = random.nextDouble(0,1);
        System.out.println(n);
        System.out.println(n1);
        System.out.println(n2);
        
    }
}
