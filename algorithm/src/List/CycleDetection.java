package CycleDetection;

class ListNode {
    int value;
    ListNode next;
    ListNode(int value) {
        this.value = value;
        next = null;
    }
}

public class CycleDetection {
    public static void printListNode(ListNode head) {
        int i=0;
        ListNode current = head;
        while(current!=null) {
            System.out.print(current.value + " -> ");
            current = current.next;
            if(i++==10)
                break;
        }
        System.out.println("null");
    }

    public static boolean hasCycle(ListNode head) {

        if(head==null || head.next == null) {
            return false;
        }

        ListNode tortoise = head;
        ListNode hare = head;

        while(hare!=null && hare.next!=null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            if(tortoise == hare) {
                return true;
            }
        }
        return false;
    }

    public static ListNode createListNodewithCycle() {
        ListNode head = new ListNode(1);
        ListNode current = head;
        for(int i=1; i<5; i++) {
            current.next = new ListNode(i+1);
            current = current.next;
            if(i==4)
                current.next = head.next.next;
        }
        return head;
    }

    public static ListNode createListNodewithoutCycle() {
        ListNode head = new ListNode(1);
        ListNode current = head;
        for(int i=1; i<5; i++) {
            current.next = new ListNode(i+1);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode headwithCycle = createListNodewithCycle();
        ListNode headwithoutCycle = createListNodewithoutCycle();

        printListNode(headwithCycle);
        printListNode(headwithoutCycle);

        if(hasCycle(headwithCycle))
            System.out.println("has cycle");
        else {
            System.out.println("has no cycle");
        }

        if(hasCycle(headwithoutCycle))
        System.out.println("has cycle");
        else {
        System.out.println("has no cycle");
    }
    }
}
