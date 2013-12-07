import java.util.*;
public class Solution
{
	public static void main(String[] args)
	{
		Set<String> set = permuteParenthesis(3);
		for(String s: set)
			System.out.println(s);
	}
	public static Set<String> permuteParenthesis(int a)
	{
		Set<String> set = permuteParenthesis("",a,a);
		return set;
	}
	private static Set<String> permuteParenthesis(String prefix , int a , int b)
	{
		if(a==0)
		{
			Set<String> set = new HashSet<String>();
			StringBuilder sb = new StringBuilder(prefix);
			while(b>0)
			{
				sb.append(")");
				b--;
			}
			set.add(sb.toString());
			return set;
		}
		if(a==b)
		{
			return permuteParenthesis(prefix+"(",a-1,b);
		}
		if(a<b)
		{
			Set<String> p = permuteParenthesis(prefix+"(",a-1,b);
			Set<String> q = permuteParenthesis(prefix+")",a,b-1);
			p.addAll(q);
			return p;
		}
		return null;
		
	}
}	
