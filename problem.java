public class problem {
    public static void main(String[] args) {
        var x=10;

        Runnable r=()->{
            // x=20;// cannot change a local variable in a inner class of java (local variable dont have scope out side function you can use it but can't modify it)
            System.out.println(x);
        };
        r.run();
    }
}
