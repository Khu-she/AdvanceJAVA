class Circle{
    Circle(){
        System.out.println("constructor");
    }
    Circle(String msg){
        System.out.println("constructor"+msg);
    }
    static double area(int r){
        return Math.PI*r*r;
    }
}
@FunctionalInterface
interface CircleInfo{
    void getInfo(String info);    
}
@FunctionalInterface
interface Area{
    double getArea(int n);
}
public class MainMethodRef {
    public static void main(String[] args) {
        Circle c =new Circle();
        // Area ca=c::area;
        Area ca=Circle::area; // area refrence will get override by the functional interface method it is possible only if the signature of the methods in interface and class have the same signature
        System.out.println("Area ="+ca.getArea(34));
        CircleInfo ci=Circle::new; // automatically new is diciding which method refrence will pass to the method by matching the soignature of the constructor and method
        ci.getInfo("msg");
    }
    
}
