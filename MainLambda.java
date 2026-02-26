import java.util.function.*;//package of different diffrent functional interfaces like suppliers counsumer producer
@FunctionalInterface
interface calc{
    void add(int n1,int n2);
}
public class MainLambda {
    public static void main(String[] args) {
        calc sum=(int n1,int n2)->{     //  anonymnous function refrence will be given to the method of the interface (signature match is a must)
            System.out.print("sum: ");
            System.out.println((n1+n2));
        };
        sum.add(23,45);
        calc s =(int n1,int n2)->System.out.println("sum: "+(n1+n2));
        s.add(1,5);
    }
}
