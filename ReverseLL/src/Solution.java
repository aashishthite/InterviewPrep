class LNode{
	public LNode next;
	public int data;
	public LNode(int k)
	{
		data = k;
		next = null;
	}
	public String toString()
	{
		LNode cur = this;
		String out = "";
		while(cur != null)
		{
			out += cur.data + "->";
			cur = cur.next;
		}
		
		return out;
	}
}
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LNode mynode = new LNode(1);
		mynode.next = new LNode(2);
		mynode.next.next = new LNode(3);
		mynode.next.next.next = new LNode(4);
		System.out.println(mynode.toString());
		System.out.println(reverseLL(mynode).toString());
	}
	public static LNode reverseLL(LNode head)
	{
		
			
		if(head == null || head.next == null)
		{
			return head;
		}
		LNode tail = head;
		while(tail.next != null)
			tail = tail.next;
		
		while(head != tail)
		{
			LNode temp = head.next;
			head.next = tail.next;
			tail.next = head;
			head = temp;
		}	
			
		return tail;
	}
	

}
