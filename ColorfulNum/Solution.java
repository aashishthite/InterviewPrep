import java.util.*;
public class Solution
{
	public static void main(String[] args)
	{
		isColorful(2363);
	}
	public static void isColorful(int num)
	{
		Set<Integer> set = new HashSet<Integer>();
		int temp = num;
		while(temp>0)
		{
			int digit = temp%10;
			if(set.contains(digit))
			{
				System.out.println("not Colorful");
				return;
			}
			set.add(digit);
			temp = temp/10;
		}
		temp = num;
		while(temp > 0)
		{
			int digitCurr = temp%10;
			int digitPrev = (temp/10)%10;
			if(set.contains(digitCurr*digitPrev))
			{
				System.out.println("not Colorful");
				return;
			}
			temp = temp/10;
		}
		System.out.println("is Colorful");
	}
}
