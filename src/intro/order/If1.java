package intro.order;

import java.time.LocalDateTime;
import java.util.Random;

public class If1 {
    public static void main(String[] args) {
        Random random = new Random(LocalDateTime.now().getSecond());
        int num = random.nextInt(100);

        if (num%2 == 0) {
            System.out.println(num + "は偶数です");
        } else {
            System.out.println(num + "は奇数です");
        }
    }
}
