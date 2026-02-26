// abstract class Area{
//     abstract void getArea();
// }

// class Rectangle extends Area{
//     int l,b;
//     Rectangle(int l,int b){
//         this.l=l;
//         this.b=b;
//     }
//     void getArea(){
//         int r=l*b;
//         System.out.println(r);
//     }
//     void display(){
//         System.out.println("i'm Display method");
//     }
// }
// public class Mainnn {
//     public static void main(String[] args) {
//         Rectangle re = new Rectangle(2,4);
//         re.getArea();
//         re.display();
//         Area r2 = new Rectangle(34,35);
//         r2.getArea();
//         Area circle = new Area(){// creating new ano class and it cannot 
//             int r=4;
//             void getArea(){
//                 int r=4;
//                 double pi=3.14;
//                 double result = r*r*pi;
//                 System.out.println(result);
//             }
//         };

//     }
    
// }
interface Area{ //buleprint for classes and obj can't be intialize (public static and final)
    abstract void getArea();
}

class Rectangle implements Area{
    int l,b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void getArea(){
        int r=l*b;
        System.out.println(r);
    }
    void display(){
        System.out.println("i'm Display method");
    }
}
public class Mainnn {
    public static void main(String[] args) {
        Rectangle re = new Rectangle(2,4);
        re.getArea();
        re.display();
        Area r2 = new Rectangle(34,35); // area cannot access the methods and variable of sub classes 
        r2.getArea(); // because of overriding we can call this method of subclass
        Area circle = new Area(){ // creating new ano class and it cannot 
            int r=4;
            public void getArea(){ //shortcut for inheritance but can only access the member of interface or super class
                int r=4;
                double pi=3.14;
                double result = r*r*pi;
                System.out.println("Circle area: "+result);
            }
        };
        circle.getArea();

    }
    
}