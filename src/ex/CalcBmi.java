package ex;

import java.util.Scanner;

public class CalcBmi {

    /**
     * 実数の入力メソッド
     * @param message String 表示メッセージ
     * @return double 入力された値
     */
    static double inputDouble(String message) {
        Scanner scanner = new Scanner(System.in);//キーボード入力をするインスタンスを作成
        System.out.println(message);
        return scanner.nextDouble();//入力された値をdouble型で返す
    }


    public static void main(String[] args) {

        //身長・体重の設定
        double height = inputDouble("身長を入力してください（単位 m）");
        double weight = inputDouble("体重を入力してください（単位 kg）");

        //BMIの計算
        double bmi = weight / Math.pow(height,2);
        bmi = Math.round(bmi * 10.0) / 10.0;

        //適正体重の計算
        double bestWeight = Math.pow(height,2) * 22;
        bestWeight = Math.round(bestWeight * 10.0) / 10.0;

        //表示
        System.out.println("身長は" + height + "m" + "です。");
        System.out.println("体重は" + weight + "kg" + "です。");
        System.out.println("BMIは" + bmi + "です。");

        //BMIに対する診断
        if (bmi < 18.5) {
            System.out.println("低体重(痩せ型)");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("普通体重");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("肥満(1度)");
        } else if (bmi >= 30.0 && bmi < 35.0) {
            System.out.println("肥満(2度)");
        } else if (bmi >= 35.0 && bmi < 40.0) {
            System.out.println("肥満(3度)");
        } else {
            System.out.println("肥満(4度)");
        }

        //適正体重
        System.out.println("適正体重は" + bestWeight + "kg" + "です。");

        //適正体重までの差
        System.out.println(Math.round((weight - bestWeight) * 10.0) / 10.0 + "Kg痩せれば適正体重です。");

    }
}
