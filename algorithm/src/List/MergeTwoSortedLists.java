package List;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 더미 노드 생성
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        // 두 리스트를 순회하며 병합
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // l1 또는 l2 중 남은 부분을 추가
        current.next = (l1 != null) ? l1 : l2;

        // 더미 노드의 다음 노드가 병합된 리스트의 시작
        return dummy.next;
    }

    // 유틸리티 메서드: 연결 리스트 출력
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // 테스트 케이스 1
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode merged = mergeTwoLists(l1, l2);
        System.out.print("Merged List 1: ");
        printList(merged);

        // 테스트 케이스 2
        l1 = null;
        l2 = new ListNode(0, new ListNode(2, new ListNode(5)));
        merged = mergeTwoLists(l1, l2);
        System.out.print("Merged List 2: ");
        printList(merged);

        // 테스트 케이스 3
        l1 = new ListNode(2, new ListNode(5, new ListNode(6)));
        l2 = null;
        merged = mergeTwoLists(l1, l2);
        System.out.print("Merged List 3: ");
        printList(merged);
    }
}
