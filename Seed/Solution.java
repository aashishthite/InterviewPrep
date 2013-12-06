import java.util.*;
public class Solution
{
	public static void main(String[] args)
	{
		findSeed(24);
	}
	public static void findSeed(int num)
	{
		List<Integer> seedNums = new ArrayList<Integer>();
		for(int ii = 1; ii <= num; ii++)
		{
			int temp = ii;
			int prod=ii;
			while(temp>0)
			{
				prod *= temp%10;
				temp = temp/10;
			}
			if(prod == num)
			{
				seedNums.add(ii);
			}
		} 
		for(Integer i : seedNums)
			System.out.println(i);
	}
}
