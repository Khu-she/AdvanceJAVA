public class MainSealed {
    sealed class Shape permits Circle, Rectangle{

    }
    final class Circle extends Shape{ // whean a subclass inherit a sealedclass its need to be declared as final,sealed or non-sealed

    }
     non-sealed class Rectangle extends Shape{

    }
    public static void main(String[] args) {
        
    }
}
