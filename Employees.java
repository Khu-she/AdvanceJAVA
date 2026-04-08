import java.util.*;
class Employee{
    String name;
    int age;

    Employee(String name,int age){
        this.name=name;
        this.age=age;
    }
    

}
class EmployeeDTO{
    String name;
    EmployeeDTO(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return name;


    }
}
public class Employees {
    public static void main(String[] args) {
        ArrayList<Employee> emp=new ArrayList<>();
        emp.add(new Employee("khushi", 19));
        emp.add(new Employee("Mohit", 20));
        emp.add(new Employee("Radwa", 21));
        emp.add(new Employee("Rishabh", 20));

       ArrayList<Employee> list = new ArrayList<>();
       list.addAll(emp);

       List<EmployeeDTO> na=list.stream().map(n->new EmployeeDTO(n.name)).toList();
       System.out.println(na);
    }
    
}
