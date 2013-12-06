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

	}
	public static LNode MergeLL(LNode a, LNode b)
	{
		
		while(a != null && b != null)
		{
			if(a.data <= b.data)
			{
				
			}
		}
		
	}

}
