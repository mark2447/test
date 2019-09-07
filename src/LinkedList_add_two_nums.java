
  class ListNode {
    public int value;
    public ListNode next;
    public ListNode(int value) {
      this.value = value;
      next = null;
    }
  }

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Write your solution here
        int a = 0;
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(l1 != null || l2 != null || a != 0) {
            if(l1 != null) {
                a += l1.value;
                l1 = l1.next;
            }
            if(l2 != null) {
                a += l2.value;
                l2 = l2.next;
            }
            cur.next = new ListNode(a%10);
            a = a/10;
            cur = cur.next;
        }
        return dummy.next;
    }
    private ListNode reverse(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
    }
}

