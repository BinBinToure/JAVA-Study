package static2.ex;

import static static2.ex.MathArrayUtils.*;

public class MathArrayUtilsMain {

    public static void main(String[] args) {

        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum=" + sum(values));
        System.out.println("average=" + MathArrayUtils.average(values));
        System.out.println("min=" + MathArrayUtils.min(values));
        System.out.println("max=" + MathArrayUtils.max(values));
    }
}
