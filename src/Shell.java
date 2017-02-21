/**
 * @author 李智
 * @date 2017/2/20
 * <p>
 * 希尔排序
 */
public class Shell {
    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) h = 3 * h + 1;//1,4,13,40...
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j <= h && Selection.less(a[j], a[j - h]); j -= h) {
                    Selection.swap(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }
}
