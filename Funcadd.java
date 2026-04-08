@FunctionalInterface
interface Add{
    int addi(int a,int b);
}


public class Funcadd {
    public static void main(String[] args) {
        Add a=(int n1,int n2)->(n1+n2);
        System.out.println(a.addi(2,3));
    }
}
