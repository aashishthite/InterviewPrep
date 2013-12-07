import java.util.*;
public class Solution
{
	public static void main(String[] args)
	{
		Integer[] arr = {-8,-3,-10,-11};
		System.out.println(maxContiSum(arr));	
	}
	public static int maxContiSum(Integer[] arr)
	{
		int curSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for(Integer i : arr)
		{
			curSum = curSum + i ;//Math.max(curSum + arr[i],0);
			maxSum = Math.max(maxSum,curSum);
			curSum = Math.max(curSum,0);
		}
		return maxSum;
	}
}
