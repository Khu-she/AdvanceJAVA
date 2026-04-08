import java.util.*;
import java.util.stream.IntStream;
public class ReduceEx {
    public static void main(String[] args) {
        // List<Integer> list=Arrays.asList(12,14,54,67,14,178,96);
        // int result= list.stream().reduce(100,(a,b)->a<b?a:b);
        // System.out.println(result);

        // List<Integer> list=Arrays.asList(12,14,54,67,14,178,96);
        // int result= list.stream().reduce(0,(a,b)->a+1);
        // System.out.println(result);

        // List<Integer> list=Arrays.asList(12,14,54,67,14,178,96);
        // int result= list.stream().reduce(0,(a,b)->{
        //     if(b%2==0){
        //         return a+b;
        //     }else{
        //         return a;
        //     }
        // });
        // System.out.println(result);

        // List<String> list=Arrays.asList("A","B","C");
        // String result= list.stream().reduce("",(a,b)->a+b);
        // System.out.println(result);

        // List<Integer> list=Arrays.asList(1,2,3,4,5,6);
        // int result= list.stream().reduce(0,(a,b)->a+(b*b));
        // System.out.println(result);

        //  List<Integer> list=Arrays.asList(1,2,3,4,5,6);
        // int result= list.stream().reduce(0,(a,b)->a>b?a:b);
        // int re=list.stream().reduce(0,(a,b)->a>b&&a<result?a:b);
        // System.out.println(re);

        // List<String> list=Arrays.asList("AN","B","C");
        // String result= list.stream().reduce("",(a,b)->a.length()>b.length()?a:b);
        // System.out.println(result);

        List<Integer> list=Arrays.asList(5);
        int n=5;
        int fact=IntStream.rangeClosed(1,n).reduce(1,(a,b)->a*b);
        System.out.println(fact);

    }
    
}
