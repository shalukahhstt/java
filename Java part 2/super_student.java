public class super_student extends Person{
    double gpa;

    super_student(String first, String last, double gpa){
        super(first,last);
        this.gpa = gpa;
    }

    void showgpa(){
        System.out.println(this.first + "'s GPA is "+ this.gpa);
    }
}
