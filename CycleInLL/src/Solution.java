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
		mynode.next.next.next.next = mynode.next.next;
		
		System.out.println(isCyclePresent(mynode));
		
	}
	public static boolean isCyclePresent(LNode node)
	{
		if(node == null)
			return false;
		LNode slow = node;
		LNode fast = node;
		while(true)
		{			
			slow = slow.next;
			fast = fast.next;
			if(slow == null || fast == null)
				return false;
			fast = fast.next;
			if(fast == null)
				return false;			
			if(slow == fast)
				return true;			
		}		
	}
}
