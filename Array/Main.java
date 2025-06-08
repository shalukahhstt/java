import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<>();
        number.add(3);
        number.add(2);
        number.add(1);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        

        ArrayList<Double> list = new ArrayList<>();
        list.add(1.09);
        list.add(11.42);
        list.add(45.321);

        System.out.println(number);
        System.out.println(fruits);
        System.out.println(list);

        //fruits.remove(1);
        fruits.set(0, "Guawa");

        System.out.println(fruits);
        System.out.println(fruits.get(0));
        System.out.println(fruits.size());

        number.sort(null);
        System.out.println(number);

    }
}