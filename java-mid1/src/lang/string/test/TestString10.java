package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {

        String fruits = "apple,banana,mango";
        String[] strings = fruits.split(",");
        for (String s : strings) {
            System.out.println(s);
        }
        String joinedString = String.join("->", strings);
        System.out.println("joinedString = " + joinedString);
    }
}
