import java.util.*; 
public class MinMaxEx { // having an comparator on the basis of the condition you give 
    public static void main(String[] args) {
    // List<Integer> list=Arrays.asList(23,12,6,67,89,43);
    // Optional<Integer> result =list.stream().min((a,b)->a);
    // Optional<Integer> result =list.stream().max((a,b)->b-a);
    // Optional<Integer> result =list.stream().max((a,b)->a-b);
    // Optional<Integer> result =list.stream().min((a,b)->a-b); //min return first element(0th index) where as max return last element(n-1 element)
    // Optional<Integer> result =list.stream().max((a,b)->b-a);
    // result.ifPresent(System.out::println);


    // List<Integer> list=Arrays.asList(23,12,12,6,6,67,89,43);
    // List<Integer> result =list.stream().distinct().toList();
    // System.out.println(result);

    // List<Integer> list=Arrays.asList(23,12,6,67,89,43);
    // Optional<Integer> result =list.stream().sorted().skip(1).min((a,b)->a-b);
    // result.ifPresent(System.out::println);
    // int result =list.stream().sorted().skip(1).findFirst().get();
    // System.out.println(result);

    List<Integer> list=Arrays.asList(23,12,12,6,6,67,89,43);
    List<Integer> result =list.stream().distinct().toList();
    System.out.println(result);
    
    }
}
