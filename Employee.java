import java.util.*;
class Employeee {
    int id;
    String name;
    double salary;
    int age;
    String department;

    public Employeee(int id, String name, double salary, int age, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
}
public class Employee{
    public static void main(String[] args) {
        
    ArrayList<Employeee> empList = new ArrayList<>(Arrays.asList(
        new Employeee(101, "Amit", 50000, 25, "IT"),
        new Employeee(102, "Neha", 60000, 28, "HR"),
        new Employeee(103, "Ravi", 45000, 24, "IT"),
        new Employeee(104, "Karan", 70000, 30, "Finance"),
        new Employeee(105, "Pooja", 55000, 27, "HR"),
        new Employeee(106, "Rohit", 80000, 32, "IT"),
        new Employeee(107, "Simran", 65000, 29, "Finance"),
        new Employeee(108, "Amit", 50000, 25, "IT")
    ));
    Optional<Employeee> result=empList.stream().min((a,b)->(int)a.salary-(int)b.salary);
    }
}
