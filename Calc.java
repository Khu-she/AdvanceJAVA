class Sum{
    int num1,num2;// instance valriablen (variable are identifer for memory allocation)
    Sum(){// user define default constructor
        this(10,10);
    }
    Sum(int num1, int num2){//num1 and num2 are local variable
        this.num1=num1;//"this" give refrence of the instance variable to local variable
        this.num2=num2;
    }
    void getSum(){
        System.out.println("Sum: "+(num1+num2));
    }
}
public class Calc {
    public static void main(String[] args) {
        Sum s;//obj declaration
        s = new Sum();//obj instantation
        s.getSum();
    }
}
