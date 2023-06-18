package in.ineuron.main;
class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        if (carry != 0) {
            current.next = new ListNode(carry);
        }

        return dummy.next;
    }
    public static void main(String[] args) {
    	ListNode l1 = new ListNode(2);
    	l1.next = new ListNode(4);
    	l1.next.next = new ListNode(3);

    	ListNode l2 = new ListNode(5);
    	l2.next = new ListNode(6);
    	l2.next.next = new ListNode(4);

    	Solution solution = new Solution();
    	ListNode result = solution.addTwoNumbers(l1, l2);
    	
    	
    	ListNode l3 = new ListNode(0);
    	ListNode l4 = new ListNode(0);

    	Solution solution1 = new Solution();
    	ListNode result1 = solution.addTwoNumbers(l1, l2);
    	
    	ListNode l5 = new ListNode(9);
    	l5.next = new ListNode(9);
    	l5.next.next = new ListNode(9);
    	l5.next.next.next = new ListNode(9);
    	l5.next.next.next.next = new ListNode(9);
    	l5.next.next.next.next.next = new ListNode(9);
    	l5.next.next.next.next.next.next = new ListNode(9);

    	ListNode l6 = new ListNode(9);
    	l6.next = new ListNode(9);
    	l6.next.next = new ListNode(9);
    	l6.next.next.next = new ListNode(9);

    	Solution solution2 = new Solution();
    	ListNode result2 = solution.addTwoNumbers(l1, l2);
    }
}

