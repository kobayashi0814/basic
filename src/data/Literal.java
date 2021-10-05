package data;

public class Literal {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 012;
        int num3 = 0xA;
        int num4 = 0b1010;

        System.out.println("num1:" + num1);
        System.out.println("num2:" + num2);
        System.out.println("num3:" + num3);
        System.out.println("num4:" + num4);


        long num5 = 1L;
        float num6 = 3.14f;
        float num7 = 3f;
        double num8 = 3d;

        System.out.println("num5:" + num5);
        System.out.println("num6:" + num6);
        System.out.println("num7:" + num7);
        System.out.println("num8:" + num8);


        double num9 = 0.123e+2;
        double num10 = 0.123e-2;

        System.out.println("num9:" + num9);
        System.out.println("num10:" + num10);


        char c1 = 'A';
        char c2 = '\u0041';
        char c3 = 65;

        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2);
        System.out.println("c3:" + c3);


        String str1 = "abc";
        String str2 = "あいうえお";
        String str3 = "\"猫\"\n\"犬\"";


        System.out.println("str1:" + str1);
        System.out.println("str2:" + str2);
        System.out.println("str3:" + str3);
    }

}
