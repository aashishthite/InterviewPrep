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
		root.right.right.left.right=new TreeNode(9);
		root.print(0);
		System.out.println(checkBalanced(root));
		
	}
	public static boolean checkBalanced(TreeNode root)
	{
		Set<Integer> set = new HashSet<Integer>();
		depthLeaves(root,1,set);
		if(set.size()>2)
		{
			return false;
		}
		if(set.size() == 1)
			return true;
		Object[] arr = set.toArray();
		if(Math.abs((Integer)arr[0]-(Integer)arr[1])>1)
		{
			return false;
		}
		else 
			return true;

			
			
	}
	public static void depthLeaves(TreeNode root,int n, Set<Integer> set)
	{
		if(root == null)
			return;
		if(root.left == null && root.right==null)
		{
			set.add(n);
			return;
		}
		else
		{
			depthLeaves(root.left,n+1,set);
			depthLeaves(root.right,n+1,set);
		}

	}
}
