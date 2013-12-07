import java.util.*;
public class Solution
{
	public static void main(String[] args)
	{
		
		Set<String> set = permuteString("aasfaa");
		for(String s: set)
			System.out.println(s);		
	}
	public static Set<String> permuteString(String s)
	{
		if(s.equals(""))
			return null;
		if(s.length() == 1)
		{
			Set<String> set = new HashSet<String>();
			set.add(s);
			return set;
		}
		Set<String> set  = new HashSet<String>();
		Set<String> setChild = permuteString(s.substring(1,s.length()));
		for(String ss: setChild)
		{
			for(int ii = 0 ; ii <= ss.length(); ii++)
			{
				set.add(ss.substring(0,ii)+s.substring(0,1)+ss.substring(ii,ss.length()));
			}
		}
		return set;
	}
}
