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
		System.out.println(LCA(root,root.right,root.left).data);
		System.out.println(LCA(root,root.right.right.left,root.left).data);
		System.out.println(LCA(root,root.right.right.left,root.right.left).data);
		System.out.println(LCA(root,root.left.left.right,root.left.right).data);

	}
	public static TreeNode LCA(TreeNode root,  TreeNode a, TreeNode b)
	{
		if(root == null)
			return root;
		if(root == a || root == b)
			return root;
		TreeNode l = LCA(root.left,a,b);
		TreeNode r = LCA(root.right,a,b);
		if(l!=null && r!= null) return root;
		if(l!=null) return l;
		else  return r;
	}
}
