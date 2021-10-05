package intro.operator;

//関係演算子による条件の書き方
public class RelationalOperatorSample {
    public static void main(String[] args) {
        int num = 50;

        //numが0以上
        System.out.println(num >= 0);

        //numが100以下
        System.out.println(num <= 100);

        //numが奇数
        System.out.println(num % 2 == 1);

        //numが3の倍数
        System.out.println(num % 3 == 0);

        //numが0以上かつ100以下 2つは同じ意味　大小は反転し、&&と||で反転する
        System.out.println(num >= 0 && num <= 100);
        System.out.println(!(num < 0 || num > 100));
    }
}
