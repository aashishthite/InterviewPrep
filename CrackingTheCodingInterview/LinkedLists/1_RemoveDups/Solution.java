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
		mynode.next.next.next = new LNode(1);
		System.out.println(mynode.toString());
		System.out.println(removeDups(mynode).toString());
	}
	public static LNode removeDups(LNode head)
	{
		if(head == null)
			return head;
		LNode temp = head;
		Set<Integer> set = new HashSet<Integer>();
		set.add(temp.data);
		while(true)
		{
			if(set.contains(temp.next.data))
			{
				//if(temp.)
				temp.next = temp.next.next;
			}
			else
			{
				set.add(temp.next.data);
			}
			if(temp.next != null)
				temp = temp.next;
			else
				break; 
		}
		return head;
	}
}
