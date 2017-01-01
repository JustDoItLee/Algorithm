/**
 * @author 李智
 * @date 2017/1/1
 *
 * 获得两个链接列表，表示两个非负数。
 * 数字以相反的顺序存储，并且它们的每个节点包含单个数字
 * 添加两个数字并将其作为链接列表返回。
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode newHead = new ListNode(0);
        ListNode p3 = newHead;
        int val;// store sum
        int carry = 0;

        while (p1 != null || p2 != null) {
            // both p1 and p2 have value
            if (p1 != null && p2 != null) {
                val = p1.val + p2.val + carry;
                carry = val / 10;
                p3.next = new ListNode(val % 10);
                p1 = p1.next;
                p2 = p2.next;
                // p1 is null, because p2 is longer
            } else if (p2 != null) {
                val = p2.val + carry;
                carry = val / 10;
                p3.next = new ListNode(val % 10);
                p2 = p2.next;
                // p2 is null, because p1 is longer
            } else if (p1 != null) {
                val = p1.val + carry;
                carry = val / 10;
                p3.next = new ListNode(val % 10);
                p1 = p1.next;
            }
            p3 = p3.next;
        }

        // handle situation that same length final sum >=10
        if (p1 == null && p2 == null && carry == 1)
            p3.next = new ListNode(1);
        return newHead.next;
    }
}