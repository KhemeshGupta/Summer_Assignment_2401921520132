class Solution {
    private ListNode findmiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    private ListNode reversing(ListNode head){
        ListNode pre=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode nexti=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nexti;
        }
        return pre;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode middle=findmiddle(head);
        ListNode secondreverse=reversing(middle.next);
        ListNode firsthalf=head;
        while(secondreverse!=null){
            if(firsthalf.val!=secondreverse.val) return false;
            firsthalf=firsthalf.next;
            secondreverse=secondreverse.next;
        }
        return true;
    }
}