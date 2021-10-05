package ex;

public class ExFor1 {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};
        int sum = 0;

        for (int num:array) {
            sum+=num;
            System.out.println(num);
        }

        System.out.println("合計:" + sum);
        System.out.println("平均:" + (double) sum / array.length);
    }
}
