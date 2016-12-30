import java.util.Arrays;

/**
 * @author 李智
 * @date 2016/12/30
 *
 * 给定一个未排序的数组，找到其排序形式的连续元素之间的最大差异。
 */
public class MaximumGap {
    public int maximumGap(int[] num) {
        Arrays.sort(num);
        int max = 0;
        for (int i = 1; i < num.length; i++) {
            if (Math.abs(num[i] - num[i - 1]) > max)
                max = Math.abs(num[i] - num[i - 1]);
        }
        return max;
    }
}
