package ex;

//配列の合計
public class ExFor {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};
        int sum = 0; //合計の箱sumを作る

        for (int i = 0; i < array.length; i++) {
            sum+= array[i];
            System.out.println(array[i]);
        }

        System.out.println("合計:" + sum);
        System.out.println("平均:" + (double) sum / array.length);
    }
}
