package scanner;

import java.util.Scanner;

public class ScannerEx9 {

    public static void main(String[] args) {

        int sum = 0;
        double average = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요 : ");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            sum += num;
            average += num;
        }
        System.out.println("입력한 숫자들의 합계 : " + sum);
        System.out.println("입력한 숫자들의 평균 : " + average / 4);
    }
}
