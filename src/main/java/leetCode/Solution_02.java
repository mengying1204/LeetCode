package leetCode;

import leetCode.common.ListNode;

public class Solution_02 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0, sum;
        ListNode head = new ListNode(0);//设置一个头结点，返回结果时不算头结点
        ListNode ln1 = l1, ln2 = l2, node = head;

        while (carry != 0 || ln1 != null || ln2 != null) {
            sum = carry; // reset sum to value of carry
            if (ln1 != null) {
                sum += ln1.val;
                ln1 = ln1.next;
            }
            if (ln2 != null) {
                sum += ln2.val;
                ln2 = ln2.next;
            }
            carry = sum / 10;
            node.next = new ListNode(sum % 10);
            node = node.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = Solution_02.addTwoNumbers(l1,l2);
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null){
                System.out.print(" -> ");
            }
            result = result.next;
        }
    }
}
