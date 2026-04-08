import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExercise {
    public static void main(String[] args) {
        
    // List data= Arrays.asList(10,15,20,25,30,11,17,16);
    // ArrayList<Integer> list=new ArrayList<>();
    // list.addAll(data);
    // System.out.println(list);
    // list.stream().filter(n->n%2==0).forEach((value)->System.out.print(value+" "));

    // List data= Arrays.asList("Amit","Ravi","vikas","Ashok","rahul");
    // ArrayList<String> list=new ArrayList<>();
    // list.addAll(data);
    // System.out.println(list);
    // // list.stream().filter(n->n.charAt(0)=='A').forEach((value)->System.out.print(value+" "));
    // list.stream().filter(n->n.startsWith("A")).forEach(n->System.out.print(n));

    // List data= Arrays.asList(10,60,45,90,30,24,50,76);
    // ArrayList<Integer> list=new ArrayList<>();
    // list.addAll(data);
    // System.out.println(list);
    // list.stream().filter(n->n>50&&n<=60).forEach((value)->System.out.print(value+" "));

    //  List data= Arrays.asList("Java","Python","C","React","C#","Next.js","Node.js");
    // ArrayList<String> list=new ArrayList<>();
    // list.addAll(data);
    // System.out.println(list);
    // list.stream().filter(n->n.length()>4).forEach((value)->System.out.print(value+" "));

    // List data= Arrays.asList("Java",null,"Spring",null,"React");
    // ArrayList<String> list=new ArrayList<>();
    // list.addAll(data);
    // System.out.println(list);
    // list.stream().filter(n->n!=null).forEach((value)->System.out.print(value+" "));
   
    // List data= Arrays.asList(3,4,7,8,9,1,5,4,16);
    // ArrayList<Integer> list=new ArrayList<>();
    // list.addAll(data);
    // System.out.println(list);
    // list.stream().filter(n->n%2!=0).forEach((value)->System.out.print(value+" "));

    // List data= Arrays.asList(10,12,15,22,25,75);
    // ArrayList<Integer> list=new ArrayList<>();
    // list.addAll(data);
    // System.out.println(list);
    // list.stream().filter(n->n%5==0).forEach((value)->System.out.print(value+" "));

    // List data= Arrays.asList("Amit","","vikas","","rahul");
    // ArrayList<String> list=new ArrayList<>();
    // list.addAll(data);
    // System.out.println(list);
    // list.stream().filter(n->n.length()>0).forEach(n->System.out.print(n+" "));

    // List data= Arrays.asList(10,20,20,30,30);
    // ArrayList<Integer> list=new ArrayList<>();
    // list.addAll(data);
    // System.out.println(list);
    // list.stream().distinct().filter(n->n>15).forEach((value)->System.out.print(value+" "));

    // List data= Arrays.asList("Java","Python","Go","React");
    // ArrayList<String> list=new ArrayList<>();
    // list.addAll(data);
    // System.out.println(list);
    // list.stream().filter(n->n.contains("o")).forEach((value)->System.out.print(value+" "));

    List data= Arrays.asList(10,15,20,25,30,35);
    ArrayList<Integer> list=new ArrayList<>();
    list.addAll(data);
    System.out.println(list);
    list.stream().filter(n->n%2==0).filter(n->n>15).forEach((value)->System.out.print(value+" "));

    }
}

