public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name1, int age1, double gpa1){

        // this refers to the object we are currently working with
        this.name = name1;
        this.age = age1;
        this.gpa = gpa1;
        this.isEnrolled = true;
    }

    void study(){
        System.out.println(this.name + " is studying");
    }
}
