import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
public class StreamEx {
    public static void main(String[] args) {
        List data= Arrays.asList(23,45,12,56,78,90);
    //  List data= List.of(23,45,12,56,78,90); read about the diffrenece between asList and List.of
    // Stream info=Stream.of(23,45,12,56,78,90,12.4,"info"); // can have decimal value and string also but is immuttable.
    ArrayList<Integer> list=new ArrayList<Integer>();
    list.add(73);
    list.addAll(List.of(35,56,78));
    list.addAll(data);
    System.out.println(list);
    // Stream listStream=data.stream();
    // Stream listStream=list.stream();
    // listStream.filter(null).toList();// this wiol first filter and then create list only once
    // // listStream.filter(null).toList();// cannot perform more than one terminal opreation on a single obj 
    // list.stream().filter(null); // if you wanna do opreation multiple time so use collection (it make new obj every time)
    list.stream().filter((n) -> n>=60).forEach(System.out::println); // list.stream is converting list to stream
    // List<Integer> g50=list.stream().filter(n->n>50).toList();
    List<Integer> g50=list.stream().filter(n->n>50).collect(collectors.toList());
    list.stream().filter(n -> n>50&&n<70).forEach((value)->System.out.print(value+" "));
    System.out.println(g50);
    list.stream().filter(n->n%2==0).forEach((value)->System.out.print(value+" "));
}
}
