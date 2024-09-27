import java.util.List;

public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list

        // Counting values in the provided array to select the position
        int count = 0;
        ListNode ref = head;
        while(ref!= null){
            count++;
            ref = ref.next;
        }


        if (position > count){
            //if the position given is bigger than the list size, append to the end
            ListNode tail = head;

            while(tail.next != null){
                tail = tail.next;
            }
            tail.next = new ListNode(val);
            return head;

        } else if (position == 1 || head == null) {
            //If the position given is 1 or if the list is empty, add the to the beginning
            ListNode newHead = new ListNode(val);
            newHead.next = head;

            return newHead;

        } else {
            // Add the node at the position given
            ListNode temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }


            ListNode newMiddle = new ListNode(val);
            newMiddle.next = temp.next;
            temp.next = newMiddle;

            return head;
        }

    }
}
