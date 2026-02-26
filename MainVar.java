
class Message{
    void getMsg(){
        System.out.println("called by var");
    }
}
public class MainVar {
    //var r=0; not allowed in instance because it is local variable type infrence 
    public static void main(String[] args) {
        var m=new Message();
        m.getMsg();

  //      var s; not possible with var initialization is must 
        var n1=10.50; // local variable type infrence 
        var n2=20; // only local variable can be declared as var and cannot be used with instance variable 
        var s=n1+n2;
        System.out.println("sum="+s);
    }
}
