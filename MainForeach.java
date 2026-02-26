import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Consumer;

public class MainForeach {
    public static void main(String[] args) {
        int data[] = new int[] {12,34,5,66,78,45};
       // List<Integer> listData= Arrays.stream(data).boxed().toList();
        List<Integer> listData= Arrays.stream(data).boxed().collect(Collectors.toList());
        //listData.forEach((iteam)->System.out.println(iteam)); // Foreach with lambda expression
        listData.forEach(System.out::println);
        System.out.println(listData);

    }
}
