/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       int len=length(head);
       int r=len-n;
       if(len==n){
        head=head.next;
        return head;
       } 
       ListNode temp=head;
       int i=0;
       while(temp!=null){
        if(i==r-1){
            temp.next=temp.next.next;
        }
        else{
            temp=temp.next;
        }
        i++;
       }
       return head;
    }
    public int length(ListNode head){
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        return n;
    }
}