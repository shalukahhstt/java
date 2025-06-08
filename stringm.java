public class stringm {
    public static void main(String[] args) {
        String name = "Shaluka";

        int length = name.length();
        char letter = name.charAt(0);
        int  index  = name.indexOf("a");
        int lastIndex = name.lastIndexOf("a");

        name = name.toUpperCase();
        System.out.println(name);
        name = name.toLowerCase();
        System.out.println(name);

        System.out.println(index);
        System.out.println(lastIndex);

        System.out.println(length);
        System.out.println(letter);

        name = name.replace("s", "$");
        System.out.println(name);

        // name.isEmpty() -- check if name is empty
        // name.contains(" ") -- chack if name contains spaces
        // name.equals("Shaluka") -- check if 2 strings equal // name.equalsIgnoreCase("SHALUKA") to ignore upper case lower cases
    }
}
