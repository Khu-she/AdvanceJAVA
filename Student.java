
import java.util.*;
public class Student {
    private int sid;
    private String name;
    private int marks;

    Student(int sid,String name,int marks){
        this.sid=sid;
        this.name=name;
        this.marks=marks;
        
    }
    @Override
    public String toString() { // override hascode of object and shows the list (doesn't pass refrence of the object only pass value)
    return name + " " + marks;
    }
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student(1,"Amit", 78));
        list.add(new Student(2,"Anil", 8));
        list.add(new Student(3,"ravi", 68));
        list.add(new Student(4,"rahul", 56));

        List<Student> as = list.stream().filter(n->n.marks>60).toList();
        as.forEach(n->System.out.print(n+" "));
    }
}
