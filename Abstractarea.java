abstract class Area{ //a class made with abstract keyword and its obj can't be instantiate directly abstract class are always incomplete (if the method are complete don't use abstract) also if a class have abstract keyword it must be declared as abstract class
     int r,l,b;
     Area(String msg){
        System.out.println("this is area consturctor");
        System.out.println(msg);
     }
     void getArea(){
        System.out.println("this is area class");
     }
}
class Circle extends Area{
    Circle(int r){  // subclass consturctor always implicitly calls super class constructor to initialize the obj of the super class(super class obj is created to pass its refrence to the child class)
        super("hello"); //calling superclass constructor
        super.r=r;
    }
    void getCircleArea(){
        final double pi = 3.14;
        double result=pi*this.r*super.r;    //because of the law of inheritance we can use this keyword but only if subclass doesn't have same variable.(but its fundamentally wrong it will fail in testing)
        System.out.println("Area of the circle is: "+result);
    }
}
public class Abstractarea {
    public static void main(String[] args) {
        Area a; //obj can be declared but can't be instantitate
    
   }
     
}
