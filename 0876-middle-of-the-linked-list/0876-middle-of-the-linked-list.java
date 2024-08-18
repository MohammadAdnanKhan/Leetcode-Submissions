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
    public static ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int i=0;
        while (temp!=null){
            i++;
            temp=temp.next;
        }
        System.out.println(i);
        int j=1;
        ListNode temp2=head;
            while (j<=i/2){
                temp2=temp2.next;
                j++;
            }
        return temp2;
}
    public static void main(String[] args) {
        ListNode ll = new ListNode(6);
        ll = new ListNode(5, ll);
        ll = new ListNode(4, ll);
        ll = new ListNode(3, ll);
        ll = new ListNode(2, ll);
        ll = new ListNode(1, ll);
        System.out.println(middleNode(ll).val);
    }}