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
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode newHead = new ListNode(0);
        ListNode p1 = l1, p2 = l2, p3 = newHead;

        while (p1 != null || p2 != null || carry != 0) {
            if (p1 != null) {
                carry += p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                carry += p2.val;
                p2 = p2.next;
            }
            int digit = carry % 10;
            p3.next = new ListNode(digit);
            p3 = p3.next;
            carry /= 10;
        }
        return newHead.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
