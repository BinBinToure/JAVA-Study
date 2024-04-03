package array;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int count = sc.nextInt();

        int[] numbers = new int[count];
        int small = count;
        int big = 0;

        System.out.println(count + "개의 정수를 입력하세요 : ");
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] < small) {
                small = numbers[i];
            } else if (numbers[i] > big) {
                big = numbers[i];
            }
        }

        System.out.println("가장 작은 정수 : " + small);
        System.out.println("가장 큰 정수 : " + big);

    }
}
