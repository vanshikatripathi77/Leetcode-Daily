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
    public ListNode deleteMiddle(ListNode head) {
        int l=length(head);
        int len=l/2;
        if(len<1){
            return null;
        }
        int i=0;
        ListNode temp=head;
        while(temp!=null){
            if(i==len-1){
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
        while(head!=null){
            head=head.next;
            n++;
        }
        return n;
    }
}