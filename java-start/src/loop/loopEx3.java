package loop;

public class loopEx3 {

    public static void main(String[] args) {

        int i = 1;
        int max = 100;
        int sum = 0;

        System.out.println("while문");
        while(i <= max) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
        System.out.println();

        sum = 0;

        System.out.println("for문");
        for (int z=1; z<=max; z++) {
            sum = sum + z;
        }
        System.out.println(sum);
    }
}
