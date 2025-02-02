public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    // Deserialize method to convert string to linked list
    public static ListNode deserialize(String s) {
        // Remove brackets and trim whitespace
        s = s.replace(\[\, \\).replace(\]\, \\).trim();
        if (s.isEmpty()) {
            return null;
        }
        // Split by commas to get individual values
        String[] parts = s.split(\,\);
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;
        for (String part : parts) {
            int value = Integer.parseInt(part.trim());
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummyHead.next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        
        while (l1 != null || l2 != null || carry != 0) {
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
        
        return dummyHead.next;
    }
}