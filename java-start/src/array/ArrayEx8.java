package array;

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("학생수를 입력하세요 : ");
        int number = sc.nextInt();

        int[][] numbers = new int[number][3];
        String[] sub = {"국어", "영어", "수학"};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요 : ");
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(sub[j] + " 점수 : ");
                numbers[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            int total = 0;
            for (int j = 0; j < numbers[i].length; j++) {
                total += numbers[i][j];
            }
            double average = (double) total / 3;
            System.out.println((i+1) + "번 학생의 총점 : " + total + ", 평균 : " + average);
        }
    }
}
