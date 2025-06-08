public class StudentMain {
    public static void main(String[] args) {
        Student st1 = new Student("Sponge Bob", 20,3.2);
        Student st2 = new Student("Patrick", 21,3.1);

        System.out.println(st1.name);
        System.out.println(st1.age);
        System.out.println(st1.gpa);
        System.out.println(st1.isEnrolled);
        
        System.out.println("\n");

        System.out.println(st2.name);
        System.out.println(st2.age);
        System.out.println(st2.gpa);
        System.out.println(st2.isEnrolled);

        st1.study();
        st2.study();

    }
}
