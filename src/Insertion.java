/**
 * @author 李智
 * @date 2017/2/18
 * <p>
 * 插入排序
 */
public class Insertion {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && Selection.less(a[j], a[j - 1]); j--) {
                Selection.swap(a, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        String[] a = {"H", "E", "L", "L", "O", "W", "O", "R", "L", "D"};
        Selection.print(a);
        long starTime = System.currentTimeMillis();
        sort(a);
        long endTime = System.currentTimeMillis();
        long time = endTime - starTime;
        Selection.print(a);
        System.out.println(time);
    }
}
