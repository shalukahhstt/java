public class super_person {
    public static void main(String[] args) {
        
        Person person = new Person("Tom", "Riddle");

        person.showName();

        super_student student =  new super_student("Harry", "Potter", 3.34);
        student.showName();
        student.showgpa();

        super_employee employee = new super_employee("Rubius", "Hagrid", 50000);
        employee.showName();
        employee.showsalary();
    }
}
