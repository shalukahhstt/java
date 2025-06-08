import java.util.Arrays;

public class arrays {

    public static void main(String[] args){

        // array = a collection of values of the same data type
        //              * think of it as a variable that can store more than 1 value *

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        fruits[0] = "pineapple";
        int numOfFruits = fruits.length;
        Arrays.sort(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }
        System.out.println(numOfFruits);

        Arrays.fill((fruits), "pineapple"); 

        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}