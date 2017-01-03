/**
 * @author 李智
 * @date 2017/1/3
 */
public class Test_1o1 {
    public static void main(String[] args) {
        System.out.println(2.0e-6 * 100000000.1); //200.0000002
        System.out.println(true && false || true && true);//true
        System.out.println((1 + 2.236) / 2);//1.618
        System.out.println(1 + 2 + 3 + 4.0);//10.0
        System.out.println(4.1 >= 4);//true
        System.out.println(1 + 2 + "3");//33

        System.out.println(isEquals(1, 2, 3));//not equals
        System.out.println(isEquals(1, 1, 1));//equals

        int f = 0;
        int g = 1;

        for (int i = 0; i < 5; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }

        System.out.println((char) ('a' + 4));
        System.out.println(toBinaryString(10));

    }

    public static String isEquals(int a, int b, int c) {
        if (a == b && a == c) return "equals";
        else return "not equals";
    }

    public static String toBinaryString(int n) {
        String s = "";
        for (int i = n; i > 0; i /= 2) {
            s = (i % 2) + s;
        }
        return s;
    }
}
