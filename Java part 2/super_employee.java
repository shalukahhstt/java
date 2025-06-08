public class super_employee extends Person{
    int salary;

    super_employee(String first, String last, int salary){
        super(first,last);
        this.salary = salary;

    }

    void showsalary(){
        System.out.println(this.first + "'s salary is $" + this.salary);
    }
}
