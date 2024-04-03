package scanner;

import java.util.Scanner;

public class ScannerEx5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 10;
        int b = 20;
        int temp;

        // 시작 : 코드를 작성하세요
        temp = a;
        a = b;
        b = temp;
        // 종료 : 코드를 작성하세요

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
