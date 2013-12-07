import java.util.*;
class TreeNode
{
	int data;
	TreeNode left;
	TreeNode right;
	public TreeNode(int d)
	{
		data = d;
		left=null;right=null;
	}
	public void print(int k)
	{
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < k; i++)
			sb.append("|\t");
		sb.append(data);
		System.out.println(sb.toString());
		if(left !=null) left.print(k+1);
		if(right !=null) right.print(k+1);
	}
}
public class Solution
{
	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right = new TreeNode(7);
		root.left.left= new TreeNode(1);
		root.left.left.right= new TreeNode(2);
		root.right.left= new TreeNode(6);
		root.right.right = new TreeNode(10);
		root.right.right.left = new TreeNode(8);
		root.print(0);
		
	}
}
