class Area{
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
public class AreaMain {
   public static void main(String[] args) {
    // Circle c = new Circle(15);
    // c.getArea();    //all the method of superclass are by default the of subclass
    // c.getCircleArea();
    // Area a = new Circle(15);//upcasting
    // a.getArea();
    Circle c =(Circle) new Area("abc"); //downcasting(not in java) converting the child refrence into parent refrence 
    c.getArea();
    c.getCircleArea(); //sub class method cannot be called because parent class doesn't have refrence for the child class obj
   }
    
}
