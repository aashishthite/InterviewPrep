import java.util.*;
public class Solution
{
	public static void main(String[] args)
	{
		String a = "lkjhp";
		String b = "hjkli";
		System.out.println(areAnagrams(a,b));
	}
	public static boolean  areAnagrams(String a, String b)
	{
		if(a.length() != b.length())
			return false;
		char[] aChar= a.toCharArray();
		char[] bChar= b.toCharArray();
		Arrays.sort(aChar);
		Arrays.sort(bChar);
		if(new String(aChar).equals(new String(bChar)))
			return true;
		else
			return false;
	}
}
