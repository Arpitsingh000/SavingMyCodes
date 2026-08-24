class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int count = len(head);
        k %= count;
        if(k == 0) return head;
        ListNode i = head;
        ListNode j = head;
        for(int x = 1; x <= k+1; x++){
            j = j.next;
        }
        while(j != null){
            i = i.next;
            j = j.next;
        }
        ListNode temp = i.next;
        i.next = null;
        ListNode t = temp;
        while(t.next != null){
            t = t.next;
        }
        t.next = head;
        return temp;
    }
    public int len(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp != null){
             count++;
             temp = temp.next;
        }
        return count;
    }
}