
import java.util.*;
import java.lang.String;
public class MapEx {
    public static void main(String[] args) {
        // List<Integer> marks=Arrays.asList(10,45,35,75,80,91,67,76);
        // ArrayList<Integer> list=new ArrayList<Integer>();
        // list.addAll(marks);
        // System.out.println(list);
        // List<Integer> graceS=list.stream().filter(n->n<40).map(m->m+5).toList();
        // System.out.println(graceS);

        // List<String> marks=Arrays.asList("sachin","rahul","amit");
        // ArrayList<String> list=new ArrayList<>();
        // list.addAll(marks);
        // System.out.println(list);
        // List<String> graceS=list.stream().map(m->m.toUpperCase()).toList();
        // System.out.println(graceS);

        // List<Integer> marks=Arrays.asList(1,2,3,4);
        // ArrayList<Integer> list=new ArrayList<Integer>();
        // list.addAll(marks);
        // System.out.println(list);
        // List<Integer> graceS=list.stream().map(m->m*m).toList();
        // System.out.println(graceS);

        // List<String> marks=Arrays.asList("Java","Python","C");
        // ArrayList<String> list=new ArrayList<>();
        // list.addAll(marks);
        // System.out.println(list);
        // // List<String> graceS=list.stream().map(m->m.substring(0,1)).toList();
        // List<Character> graceS=list.stream().map(m->m.charAt(0)).toList();
        // System.out.println(graceS);

        // List<Integer> marks=Arrays.asList(10,20,30);
        // ArrayList<Integer> list=new ArrayList<Integer>();
        // list.addAll(marks);
        // System.out.println(list);
        // List<String> graceS=list.stream().map(m->String.valueOf(m)).toList();
        // System.out.println(graceS);

        // List<String> marks=Arrays.asList("A","B","C");
        // ArrayList<String> list=new ArrayList<>();
        // list.addAll(marks);
        // System.out.println(list);
        // List<String> graceS=list.stream().map(m->"iteam - "+m).toList();
        // System.out.println(graceS);

        // List<String> marks=Arrays.asList("Java","Python","C");
        // ArrayList<String> list=new ArrayList<>();
        // list.addAll(marks);
        // System.out.println(list);
        // List<Integer> graceS=list.stream().map(m->m.length()).toList();
        // System.out.println(graceS);

        List<Integer> marks=Arrays.asList(1,2,3,4,5,6);
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.addAll(marks);
        System.out.println(list);
        List<Integer> graceS=list.stream().map(m->m%2==0?1:0).toList();
        System.out.println(graceS);
        
        // List<String> has=Arrays.asList("Java","Python","C");
        // ArrayList<String> list=new ArrayList<>();
        // list.addAll(has);
        // System.out.println(list);
        // List<Integer> graceS=list.stream().map(m->m.hashCode()).toList();
        // System.out.println(graceS);
    }
}
