package class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {

        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[3];

        // 상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장
        ProductOrder dubu = new ProductOrder();
        productOrders[0] = dubu;
        dubu.productName = "두부";
        dubu.price = 2000;
        dubu.quantity = 2;

        ProductOrder kimchi = new ProductOrder();
        productOrders[1] = kimchi;
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        ProductOrder coke = new ProductOrder();
        productOrders[2] = coke;
        coke.productName = "콜라";
        coke.price = 1500;
        coke.quantity = 2;

        // 상품 주문 정보와 최종 금액 출력
        int totalAmount = 0;
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명 : " + productOrder.productName + ", 가격 : " + productOrder.price +
                    ", 수량 : " + productOrder.quantity);
            totalAmount += productOrder.price * productOrder.quantity;
        }
        System.out.println("총 결제 금액 : " + totalAmount);
    }
}
