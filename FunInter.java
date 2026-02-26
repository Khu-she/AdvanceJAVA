@FunctionalInterface //special interface those declare with functioninterface annotation and only have one abstract method
interface Sub{
    int subtract(int n1,int n2);
    default int subt(int q){
        return 2;
    }
}
public class FunInter {
    public static void main(String[] args) {
        Sub s=new Sub(){
            @Override
            public int subtract(int n1,int n2){
                return n1-n2;
            }
        };
        int r=s.subtract(100,90);
        System.out.println("subtraction: "+r);
        Sub s1=(int n1,int n2)->n1-n2; //lambda expression
        int r1=s.subtract(10,90);
        System.out.println("subtraction: "+r1);
    }
    
}
