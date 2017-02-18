/**
 * @author 李智
 * @date 2017/2/18
 * <p>
 * 选择排序
 */
public class Selection {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[i])) {
                    swap(a, j, i);
                }
            }
        }
    }

    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static void swap(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void print(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] a = {"H", "E", "L", "L", "O", "W", "O", "R", "L", "D"};
        print(a);
        long starTime = System.currentTimeMillis();
        sort(a);
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
        long endTime = System.currentTimeMillis();
        long time = endTime - starTime;
        print(a);
        System.out.println(time);

    }
}
