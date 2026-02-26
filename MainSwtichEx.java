public class MainSwtichEx { // single variable having multiple choice is where swtich is used normal swtuch doesn't return value whereas swtich expression do return value
    public static void main(String[] args) {
        int day=1;
        String result=switch(day){
            case 1,7 -> {
                System.out.println("This is case 1,7");
                yield "Monday"; // yield work as return in swtich expression
            }
            case 2,3,4-> "Tuesday";
            default->"No day";
        };
        System.out.println(result);
    }
}
