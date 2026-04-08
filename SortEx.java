import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.*;


public class SortEx {
    public static void main(String[] args) {
        // List<Integer> list=Arrays.asList(12,56,2,78,9,4);
        // System.out.println(list);
        // List<Integer> sorted=list.stream().sorted().toList();
        // System.out.println(sorted);

        // List<Integer> list=Arrays.asList(12,56,2,78,9,4);
        // System.out.println(list);
        // List<Integer> sorted=list.stream().sorted(Comparator.reverseOrder()).toList(); // comparable have a method name compareto with one parameter and return type int. comparator have a method compare with two parameter and return type int 
        // System.out.println(sorted);
        // List<Integer> revsorted=list.stream().sorted((a,b)->b-a).toList(); //to sort in decreasing order
        // System.out.println(revsorted);

        // List<Integer> list=Arrays.asList(12,56,2,78,9,4);
        // System.out.println(list);
        // List<Integer> sorted=list.stream().sorted().toList();
        // System.out.println(sorted);

        // List<Integer> list=Arrays.asList(12,56,2,78,9,4);
        // System.out.println(list);
        // List<Integer> sorted=list.stream().sorted(Comparator.reverseOrder()).limit(3).toList(); // comparable have a method name compareto with one parameter and return type int. comparator have a method compare with two parameter and return type int 
        // System.out.println(sorted);
       
        // List<Integer> list=Arrays.asList(12,56,2,78,9,4);
        // System.out.println(list);
        // List<Integer> sorted=list.stream().filter(n->n%2==0).sorted().toList();
        // System.out.println(sorted);

        // List<Integer> list=Arrays.asList(12,56,2,78,9,4);
        // System.out.println(list);
        // // int sorted=list.stream().sorted((a,b)->b-a).toList().get(1);
        // int sorted=list.stream().sorted((a,b)->b-a).skip(1).findFirst().get();
        // System.out.println(sorted);

        // List<String> list=Arrays.asList("Ravi","Ankit","Meena");
        // System.out.println(list);
        // List<String> sorted=list.stream().sorted().toList();
        // System.out.println(sorted);

        List<String> list=Arrays.asList("Ravi","ankit","Meena");
        System.out.println(list);
        // List<String> sorted=list.stream().sorted(Comparator.reverseOrder()).toList();
        List<String> sorted=list.stream().sorted((a,b)->a.compareTo(b)).toList();
        System.out.println(sorted);



    }
    
}
