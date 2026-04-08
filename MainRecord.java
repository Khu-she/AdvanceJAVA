// class Student{
//     int id;
//     String name;
//     int rno;
// }
record Student(int id,String name,int rno){};//final value will not change only untill the object is not made once its made then the value will be final
public class MainRecord {
    public static void main(String[] args) {
        Student s = new Student(1,"sam",1);
        System.out.println("Student id: "+s.id());
        System.out.println("Name: "+s.name());
        System.out.println("Roll no. : "+s.rno());
    }
}
