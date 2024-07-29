public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World Again");
// To split the string use split()
        String[] splitStrings = "Hello World Again ".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText1("Hello");
        System.out.println("_".repeat(20));
        printText1("Hello","World","Again");

        String[] stringArray = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
//        joining 2 strings
        System.out.println(String.join(":",stringArray));
    }

    public static void printText(String[] splitStrings) {

        for (String t:splitStrings){
            System.out.println(t);
        }
    }

    public static void printText1(String... splitStrings) {

        for (String t:splitStrings){
            System.out.println(t);
        }
    }

}
