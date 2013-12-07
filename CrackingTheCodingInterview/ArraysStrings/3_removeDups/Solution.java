import java.util.*;
public class Solution
{
	public static void main(String[] args)
	{
		String str = "Aashish Bhaskar Thite ";
		System.out.println(removeDups(str));
	}
	public static String removeDups(String str)
	{
		char[] charArr = str.toCharArray();
		boolean[] charSet = new boolean[256];
		for(int ii =0; ii < str.length(); ii++)
		{
			if(charSet[str.charAt(ii)])
			{
				str = str.substring(0,ii) + str.substring(ii+1, str.length());
				ii--;
			}
			else
			{
				charSet[str.charAt(ii)]=true;
			}
		}
		return str;
	}

}
