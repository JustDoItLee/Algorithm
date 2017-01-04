/**
 * @author 李智
 * @date 2017/1/4
 */
public class Test_1o2 {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        System.out.println(string1);//world
        System.out.println(string2);//hello

        String s = "Hello World";
        s.toUpperCase();
        s.substring(6,11);
        System.out.println(s);//Hello World
    }
}
