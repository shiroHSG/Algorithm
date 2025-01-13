package ReverseList;

class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;   //이전 노드 저장
        ListNode current = head;    //현재 노드부터 시작
        
        //헤드 노드의 다음 노드를 헤드노드를 가리키기 위해 미리저장
        //이후 헤드 노드는 마지막 null을 가리키고 저장해둔 다음 노드가
        //마지막위치로 바뀐 헤드 노드를 가리키게함
        //결국 가장 마지막 노드는 null을 가리킬거고
        //마찬가지로 current는 마지막에 null을 가리키게 되므로 탈출
        while(current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while(current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode current = head;
        for(int i=1; i<5; i++) {
            current.next = new ListNode(i+1);
            current = current.next;
        }

        printList(head);

        ListNode reversedHead = reverseList(head);

        printList(reverseList(reversedHead));
    }
}