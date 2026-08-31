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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer>list=new ArrayList<>();
        ListNode cur=head;
        while(cur!=null){
            list.add(cur.val);
            cur=cur.next;
        }
        int cr[]=list.stream().mapToInt(i->i).toArray();
        
        if(cr.length<3)return new int[]{-1,-1};
        list.clear();

        for(int i=1;i<cr.length-1;i++){
            if(cr[i]>cr[i-1] && cr[i]>cr[i+1])
                list.add(i+1);
            else if(cr[i]<cr[i-1] && cr[i]<cr[i+1])
                list.add(i+1);
        }
        if(list.size()<2)return new int[]{-1,-1};
        
        int []res=list.stream().mapToInt(i->i).toArray();
        int min=Integer.MAX_VALUE;
        for(int i=1;i<res.length;i++)
            min=Math.min(min,res[i]-res[i-1]);
        return new int[]{min,res[res.length-1]-res[0]};
    }
}