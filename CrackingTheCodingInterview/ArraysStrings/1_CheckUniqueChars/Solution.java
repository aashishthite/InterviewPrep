import java.util.*;
public class Solution
{
	public static void main(String[] args)
	{
		String str = "apl07+[;'";
		System.out.println(checkUniqueChars(str));	
	}
	public static boolean checkUniqueChars(String str)
	{
		char[] charArr = str.toCharArray();
		boolean[] charSet = new boolean[256];
		for(int ii = 0; ii < charArr.length; ii++)
		{
			if(charSet[charArr[ii]])
				return false;
			else
				charSet[charArr[ii]]=true;
		}
		return true;
	}
}
