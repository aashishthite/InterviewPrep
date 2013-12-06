import java.util.*;
public class Solution
{
	public static void main(String[] args)
	{
		findConti("AbcDefljdflsjflmnopflsjflasjftuvWxYz");
	}
	public static void findConti(String str)
	{
		str=str.toLowerCase();
		char[] strchar = str.toCharArray();
		int curr = 0, next = 1;
		StringBuilder sb = new StringBuilder();
		sb.append(strchar[curr]);
		while(next<str.length())
		{
			if(strchar[next] - strchar[curr] == 1)
			{
				sb.append(strchar[next]);
			}
			else
			{
				if(sb.toString().length()>1) System.out.println(sb.toString());
				sb = new StringBuilder();
				sb.append(strchar[next]);
			}
			next++; curr++;
		}
		if(sb.toString().length()>1) System.out.println(sb.toString());

	}
}
