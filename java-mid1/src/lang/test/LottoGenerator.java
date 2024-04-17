package lang.test;

import java.util.Random;

public class LottoGenerator {

    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;

        while (count < 6) {
            // 1부터 45 사이의 숫자 생성
            int num = random.nextInt(45) + 1;
            if (isUnique(num)) {
                lottoNumbers[count] = num;
                count++;
            }
        }

        return lottoNumbers;
    }

    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if (lottoNumbers[i] == number) {
             return false;
            }
        }
        return true;
    }
}


