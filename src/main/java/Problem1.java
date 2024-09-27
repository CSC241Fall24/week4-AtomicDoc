// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2

        ListNode temp = new ListNode(0);
        ListNode current = temp;

        //Checks if l1 is empty, if so the concat list would just be l2
        if (l1 == null){
            return l2;
        }

        //This while statement will traverse l1 until it reaches the end

        ListNode tail = l1;
        while(tail.next != null){
          //current = current.next;
            tail = tail.next;
        }

        while(l2 != null){
            tail.next = new ListNode(l2.val);
            tail = tail.next;
            l2 = l2.next;
        }

        return l1;
    }
}