class Animal{
    String name;
    String sound;
    void makesound(){
        System.out.println("animal class");
    } 
    // String makesound(String name){ // Overriding doesn't depend on return type
    //     System.out.println("Overriding doesn't depend on return type");
    //     return "";
    // }
    void makesound(String name, String sound){
       String result=String.format("Name=%s and Sound=%s",name,sound);
        System.out.println(result);
    } 
    void display(){
        String result=String.format("Name=%s and Sound=%s",name,sound);
        System.out.println(result);
    }
}
class Cat extends Animal{
     int legs;
     Cat(String name, String sound, int legs){
        super.name=name;
        super.sound=sound;
        this.legs=legs;
     }
    //  void sound(){
    //     System.out.println("overriding");
    //     String result=String.format("Name=%s, Sound=%s and legs=%d",name,sound,legs);
    //     System.out.println(result);
    //  }
    void makesound(String name){                                                 //as by the law of inheritance all member of the super class are by default the member of sub class hence this is overloading because even if we explicitly dont declare void sound method it is deafaultly a member of subclass
        System.out.println("overriding");
        String result=String.format("Name=%s, Sound=%s and legs=%d",name,sound,legs);
        System.out.println(result);
     }
     void displayinfo(){
        String result=String.format("Name=%s, Sound=%s and legs=%d",name,sound,legs);
        System.out.println(result);
    }
}
public class MainPoly {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        a.sound("Dog","Bark");
        a.display();
        Cat c = new Cat("Cat","meaow",4);
        c.sound();
        


    }
}
