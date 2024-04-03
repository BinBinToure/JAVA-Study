package method;

public class MethodEx2 {

    public static void main(String[] args) {

        String message = "Hello, world!";
        message(message, 3);

    }

    public static void message(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }
}
