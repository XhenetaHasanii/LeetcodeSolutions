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
    public int getDecimalValue(ListNode head) {
        ListNode actualNode=head;
        List<Integer> numbers=new ArrayList<>();
        while(actualNode!=null && actualNode.next!=null)
        { 
        numbers.add(actualNode.val);
        actualNode=actualNode.next;
        }
        numbers.add(actualNode.val);
        int d=1;
        int sum=0;
        for (int i=0; i<numbers.size();i++)
            {
            int pow=numbers.size()-d;
            sum+=numbers.get(i) *( Math.pow(2,pow));
            d=d+1;
              
        }
        return sum;
            
        
        
    }
}