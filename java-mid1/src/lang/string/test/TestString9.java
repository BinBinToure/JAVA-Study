package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {

        String email = "hello@example.com";
        String[] splitStr = email.split("@");
        String ID = splitStr[0];
        String Domain = splitStr[1];

        System.out.println("ID = " + ID);
        System.out.println("Domain = " + Domain);
    }
}
