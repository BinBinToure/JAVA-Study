package loop;

public class loopEx1 {

    public static void main(String[] args) {

        int count = 1;

        System.out.println("while문");
        while (count < 11) {
            System.out.println(count);
            count++;
        }

        System.out.println();
        System.out.println("for문");
        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }
    }
}
