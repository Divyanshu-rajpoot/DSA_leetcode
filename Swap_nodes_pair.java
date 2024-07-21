public class Swap_nodes_pair {
    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    //24. Swap Nodes in Pairs 
    public ListNode swapPairs(ListNode head) {
        if(head == null ){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode prev = dummyHead;
        ListNode temp = head;
        ListNode next = temp.next;
        while(temp!=null && temp.next!=null){  //check for both even and odd length
            //swapping nodes
            temp.next = next.next;
            next.next = temp;
            prev.next = next;
            //updating nodes
            prev = temp;   
            temp = temp.next;
            if(temp!=null){
                next = temp.next;
            }
        }
        return dummyHead.next;
    }
}
