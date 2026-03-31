/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hp=new HashSet<>();
        while(head!=null){
            if(hp.contains(head)){
                return head;
            }
            hp.add(head);
            head=head.next;
        }
        return null;
    }
}