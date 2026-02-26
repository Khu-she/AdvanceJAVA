class Division{
    static int getDiv(int num1, int num2){
        return num1/num2;
    }
}
public class Calculator {
    public static void main(String[] args) {
        Division d = new Division();
        System.out.println(d.getDiv(8,2));
    }
}
