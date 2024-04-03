package loop;

public class loopEx2 {

    public static void main(String[] args) {

        System.out.println("while문");
        int num = 1;
        while (num <= 20) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }

        System.out.println();
        System.out.println("for문");
        for (int i=1; i<=20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
