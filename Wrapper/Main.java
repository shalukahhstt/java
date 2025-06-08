public class Main {
    public static void main(String[] args) {

        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                                   to be used as objects. "Wrap them in an object"
        //                                   Generally, don't wrap primitives unless you need an object.
        //                                   Allows use of Collections Framework and static utility methods.

        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;
   
        // Unboxing
        int x = a;

        String e = Integer.toString(123);
        String f = Double.toString(123.32);
        String g = Character.toString('A')
        String h = Boolean.toString(true);

        String x = e+f+g+h;

        System.out.println(x);

        int i = Integer.parseInt("1223");
        double j = Double.parseDouble("121.12");
        char k = "A".charAt(0);
        boolean l = Boolean.parseBoolean("true");

        


    }
}

