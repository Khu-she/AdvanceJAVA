abstract class Area{// ability of a object to hide unnecssary things and only show necessary
    abstract void getArea();
    
}
class Rectangle extends Area{
    int l,b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }

    void getArea(){
        int r=l*b;
        System.out.println(r);
    }
    
}
public class MainArea {
    public static void main(String[] args) {
        Rectangle re = new Rectangle(2, 4);
        re.getArea();
        
    }
    
}
