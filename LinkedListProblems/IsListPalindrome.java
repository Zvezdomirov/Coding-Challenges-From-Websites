import providedutils.ListNode;

public class IsListPalindrome {
    public static void main(String[] args) {

        ListNode<Integer> head = new ListNode<>(5);
        head.next = new ListNode<>(10);
        head.next.next = new ListNode<>(10);
        head.next.next.next = new ListNode<>(5);
        System.out.println(isListPalindrome(head));
//        //Testing the reverse method
//        System.out.println("Before reversing: ");
//        ListNode<Integer> temp = head;
//        while (temp != null) {
//            System.out.println(temp.value);
//            temp = temp.next;
//        }
//
//        System.out.println("After reversing: ");
//        temp = reverse(head);
//        while (temp != null) {
//            System.out.println(temp.value);
//            temp = temp.next;
//        }
    }

    private static <T> boolean isListPalindrome(ListNode<T> head) {
        ListNode<T> slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //Length of list is odd number
        if (fast != null) {
            slow = slow.next;
        }

        slow = reverse(slow);
        fast = head;
        while (slow != null) {
            if (!slow.value.equals(fast.value)) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    private static <T> ListNode<T> reverse(ListNode<T> head) {
        ListNode<T> prev = null;
        while (head != null) {
            ListNode<T> next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}