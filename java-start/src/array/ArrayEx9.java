package array;

import java.util.Scanner;

public class ArrayEx9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maxNum = 10;
        String[] productNames = new String[maxNum];
        int[] productPrices = new int[maxNum];
        int productCount = 0;

        while (true){
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요 : ");
            int num = scanner.nextInt();
            scanner.nextLine();

            if (num == 1) {
                if (productCount >= maxNum) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요 : ");
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요 : ");
                productPrices[productCount] = scanner.nextInt();

                productCount++;
            } else if (num == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int j=0; j < productCount; j++) {
                    System.out.println(productNames[j] + " : " + productPrices[j] + "원");
                }
            } else if (num == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }
    }
}
