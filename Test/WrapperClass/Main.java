package Test.WrapperClass;

public class Main {

    public static void main(String[] args){

        //Wrapper class = allows primitive value (int, char, double, boolean) to be used as objects

        /*//Autoboxing
        Integer a = 123;
        Character b = '2';
        Boolean c = true;
        Double d = 3.14;
        String e = "Burger";

        //Unboxing
        int x = a;*/

        /*String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('A');
        String d = Boolean.toString(false);

        String x = a + b + c + d;

        System.out.println(x);*/


        /*//Parsing
        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.145");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("True");*/

        char letter = 'b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
    }
}
