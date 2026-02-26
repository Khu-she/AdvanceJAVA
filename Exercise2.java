// import javax.sound.sampled.SourceDataLine;

import java.util.ArrayList;
import java.util.HashMap;

@FunctionalInterface
interface SquareOfNumber{
    int square(int n);
}

@FunctionalInterface
interface Palindrome{
    boolean ispalin(String word);
}
public class Exercise2 {
    public static void main(String[] args) {
        SquareOfNumber s=(n)->n*n;
        System.out.println(s.square(3));
    
    // Palindrome p=(word)->{
    //     int i=0;
    //     int j=word.length()-1;

    //     while(i<j){
    //         if(word.charAt(i)!=word.charAt(j)){
    //             return false;
    //         }
    //         i++;
    //         j--;
    //     }
    //     return true;
    // };
    // System.out.println(p.ispalin("maam"));
    // }
    Palindrome p2=(word)->{
        // String rev=new StringBuilder(word).reverse().toString();
        // if(rev.equals(word)){
        //     return true;
        // }else{
        //     return false;
        // }

        // return rev.equals(word);
        return new StringBuilder(word).reverse().toString().equals(word);
        
    };
    System.out.println(p2.ispalin("maam"));

    var list=new ArrayList<String>(); //generic programming
    var map=new HashMap<Integer,String>(); // bydefault datatype is string hence its need to be specify
    var num=20;
    
}
}
