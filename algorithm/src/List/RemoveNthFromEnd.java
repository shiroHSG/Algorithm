package List;

public class RemoveNthFromEnd {
    public static ListNode removeNthFromEnd (ListNode head, int n) {
        // dummy는 헤드를 가리키게 함
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // fast 포인터를 n+1번 이동시켜 slow와 n의 간격을 만든다
        // 둘 사이에 n개의 노드가 있게 되고 fast가 null이 되는 경우
        // slow.next가 뒤에서 n번째 노드를 가리키게 됨
        for(int i=0; i<=n; i++) {
            fast = fast.next;
        }

        while(fast!=null) {
            fast = fast.next;
            slow = slow.next;
        }

        // slow 포인터는 삭제할 노드의 앞의 위치에 있다
        slow.next = slow.next.next;

        // 더미 노드의 next를 반환 (새로운 head)
        return dummy.next;
    }

    public static void main(String[] args) {
        
    }
}