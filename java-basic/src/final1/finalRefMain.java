package final1;

public class finalRefMain {

    public static void main(String[] args) {

        // 참조형
        final Data data = new Data();
        // data = new Data();

        // 참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
