interface InterfaceA {
    default void display() {
        System.out.println("Display from InterfaceA");
    }
}

interface InterfaceB {
    default void display() {
        System.out.println("Display from InterfaceB");
    }
}


class Demo2 implements InterfaceA, InterfaceB {
       public void display() {

        InterfaceA.super.display();
        InterfaceB.super.display();
    }

    public static void main(String[] args) {

        Demo2 obj = new Demo2e();
        obj.display();
    }
}


