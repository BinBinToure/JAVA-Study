package cond;

public class Ex7 {

    public static void main(String[] args) {

        int x = 3;

        String str = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + str);
    }
}
