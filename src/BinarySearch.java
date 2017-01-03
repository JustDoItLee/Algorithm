/**
 * @author 李智
 * @date 2017/1/3
 *
 * 二分查找
 */
public class BinarySearch {
    //有序数组
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        //被查找的键要么不存在，要么存在于a[lo..hi]之中
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
