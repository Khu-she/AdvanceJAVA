import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.Actio

public class Exercise {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run(){
                System.out.println("Running thread");
            }
        };
        Runnable r2=()->System.out.println("Running thread");
        r2.run();

        Comparator<Integer> c=new Comparator<Integer>() {
            public int compare(Integer a,Integer b){
                return a-b;
            }
        };
        Comparator<Integer> c2=(Integer a,Integer b)->a-b;
        System.out.println(c2.compare(3,4));

        Callable<Integer> ca= new Callable<Integer>() {
            public Integer call(){
                return 100;
            }
        };

        ActionListener al=new  ActionListener(){
            public void actionPerformed(ActionEvent e){

            }

        };
    }

    
}
