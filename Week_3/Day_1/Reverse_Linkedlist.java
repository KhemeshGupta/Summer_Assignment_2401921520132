class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode pre=head;
        ListNode curr=head.next;
        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nextNode;
        }
        head.next=null;
        head=pre;
        return head;
    }
}
