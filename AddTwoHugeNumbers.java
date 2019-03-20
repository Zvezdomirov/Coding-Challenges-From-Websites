import providedutils.ListNode;

public class AddTwoHugeNumbers {
    public static void main(String[] args) {
        ListNode<Integer> a = new ListNode<>(9876);
        a.next = new ListNode<>(5432);
        a.next.next= new ListNode<>(1999);

        ListNode<Integer> b = new ListNode<>(1);
        b.next = new ListNode<>(8001);

        ListNode<Integer> sum = addTwoHugeNumbers(a, b);

    }

    private static ListNode<Integer> addTwoHugeNumbers(
            ListNode<Integer> a, ListNode<Integer> b) {
        a = reverseLinkedList(a);
        b = reverseLinkedList(b);
        ListNode<Integer> result = new ListNode<>(0);
        ListNode<Integer> resultHead = result;

        while (a != null && b != null) {
            resultHead.next = new ListNode<>(0);
            int tempSum = a.value + b.value;
            if (tempSum >= 10000) {
                resultHead.next.value += 1;
                tempSum -= 10000;
            }
            resultHead.value += tempSum;
            resultHead = resultHead.next;
            a = a.next;
            b = b.next;
        }
        //add the remaining elements
        while (a != null) {
            resultHead.value += a.value;
            a = a.next;
            resultHead = resultHead.next;
        }
        while (b != null) {
            resultHead.value += b.value;
            b = b.next;
            resultHead = resultHead.next;
        }

        return reverseLinkedList(result);
    }

    @SuppressWarnings("Duplicates")
    private static <T> ListNode<T> reverseLinkedList(ListNode<T> head) {
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

