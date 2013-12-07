import java.util.*;
class LNode
{
	int data;
	LNode next;
	public LNode(int d)
	{
		data = d;
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
public class Solution
{
	public static void main(String[] args)
	{
		LNode mynode = new LNode(1);
		mynode.next = new LNode(2);
		mynode.next.next = new LNode(3);
		mynode.next.next.next = new LNode(4);
	}
}
