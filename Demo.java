@FunctionalInterface
interface MyInterface{
    void show();
}

public class Demo {
    static void display() {
        System.out.println("Hello Java");
    }

    public static void main(String[] args) {
        MyInterface ref = Demo::display;
        ref.show();
    }

}
