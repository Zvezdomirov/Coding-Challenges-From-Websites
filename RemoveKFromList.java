public class RemoveKFromList {
    public static void main(String[] args) {
        ListNode<Integer> l = new ListNode<>(1000);
        l.next = new ListNode<>(1000);
        ListNode<Integer> result = removeKFromList(l, 1000);
    }

    static ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
        ListNode<Integer> newHead = new ListNode<Integer>(null);
        newHead.next = l;
        ListNode<Integer> prev = newHead;
        ListNode<Integer> curr = l;
        while (curr != null) {
            if (curr.value == k) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return newHead.next;
    }
}
// Definition for singly-linked list:
class ListNode<T> {
    ListNode(T x) {
        value = x;
    }
    T value;
    ListNode<T> next;
}

