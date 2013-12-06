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
		//mirror(root);
		//root.print(0);
		//System.out.println(isBST(root));
		List<TreeNode> out = printSpiral(root);//dfsIterative(root);
		for(TreeNode t : out)
			System.out.print(t.data + " ");
		System.out.println();
		//dfs(root);
		System.out.println();
	}
	public static void mirror(TreeNode root)
	{
		if(root==null)
			return;
		mirror(root.left);
		mirror(root.right);
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;

	}
	public static boolean isBST(TreeNode root)
	{
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	private static boolean isBST(TreeNode root, int  min, int max)
	{
		if(root == null)
			return true;
		if(root.data > min && root.data < max)
		{
			return isBST(root.left,min,root.data) && isBST(root.right,root.data,max);
		}
		else 
			return false;

	}
	public static List<TreeNode> bfs(TreeNode root)
	{
		//if(root==null)
		//	return new ArrayList<TreeNode>();

		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		List<TreeNode> out = new ArrayList<TreeNode>();
		while(!q.isEmpty())
		{
			TreeNode temp = q.poll();
			out.add(temp);
			if(temp.left != null)
				q.offer(temp.left);
			if(temp.right != null)
				q.offer(temp.right);
		}
		return out;
	}
	public static List<TreeNode> dfsIterative(TreeNode root)
	{
		Stack<TreeNode> stk = new Stack<TreeNode>();
		stk.push(root);
		List<TreeNode> lst = new ArrayList<TreeNode>();
		while(!stk.isEmpty())
		{
			TreeNode temp = stk.pop();
			lst.add(temp);
		
			if(temp.right != null)
				stk.push(temp.right);
			if(temp.left != null)
				stk.push(temp.left);
		}
		return lst;
	}
	public static void dfs(TreeNode root)
	{
		if(root==null)
			return;
		System.out.print(root.data + " ");
		if(root.left != null)
			dfs(root.left);
		if(root.right != null)
			dfs(root.right);
	}
	public static List<TreeNode> printSpiral(TreeNode root)
	{
		if(root	== null)
			return new ArrayList<TreeNode>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		List<TreeNode> out = new ArrayList<TreeNode>();
		q.offer(root);
		boolean switchOrder = true;
		while(!q.isEmpty())
		{
			int qSize = q.size();
			Stack<TreeNode> stk = new Stack<TreeNode>();
			for(int ii = 0; ii <qSize; ii++)
			{
				TreeNode temp = q.poll();
				if(!switchOrder)
					out.add(temp);
				else
				{
					stk.push(temp);
				}
				if(temp.left != null)
					q.offer(temp.left);
				if(temp.right != null)
					q.offer(temp.right);

			}
			if(switchOrder)
			{
				for(int ii =0; ii <qSize; ii++)
				{
					out.add(stk.pop());
				}

			}
			switchOrder = !switchOrder;

		}
		return out;
	}

}
