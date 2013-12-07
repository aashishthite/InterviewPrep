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
		System.out.println(mynode);
		System.out.println(nth2Last(mynode,3));
		System.out.println(nth2Last(mynode,5));
		System.out.println(nth2Last(mynode,1));
	}
	public static int nth2Last(LNode head, int n)
	{
		if(head == null)
			return -1;
		LNode forward = head;
		for(int ii = 0; ii < n && forward!=null; ii++)
		{
			forward = forward.next;
		}
		if(forward == null)
			return -1;
		while(forward.next !=null)
		{
			forward = forward.next;
			head = head.next;
		}
		return head.data;
	}
}
