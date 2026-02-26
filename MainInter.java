interface Msg{//interface is a bule print for a class and only have abstract method before java1.7 , after java1.7 from java 1.8 we can also define default method satic method and private method, default method can be override 
    void displayMsg();
    default void displayMsg(String msg){
        pvt(msg);
    }
    static void displayInfo(){
        System.out.println("information");
    }
    private void pvt(String msg){
        System.out.println(msg);
        System.out.println("private");
    }
}
class DisplayMessage implements Msg{
    public void displayMsg(){
        System.out.println("hi");
    }
    public void displayMsg(String msg){
        System.out.println("hi");
    }
}
public class MainInter {
    public static void main(String[] args) {
        DisplayMessage d = new DisplayMessage();
        d.displayMsg();
        d.displayMsg("hello");
        Msg.displayInfo();
    }
}
