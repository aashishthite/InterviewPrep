import java.util.*;
public class Solution
{
	public static void main(String[] args)
	{
		int[] arr = {1,5,4,6,9,3,0,0,1,3};
		int[] arr1 = {2,8,3,6,9,3,0,0,1,3};
		System.out.println(minJumps(arr1));
	}
	public static int minJumps(int[] arr)
	{
		int[] jumps = new int[arr.length];
		for(int ii = 0; ii<arr.length-1; ii++)
		{
			jumps[ii]= Integer.MAX_VALUE;
		}
		jumps[arr.length-1]=0;
		for(int ii = arr.length-1; ii >=0; ii--)
		{
			if(jumps[ii] == Integer.MAX_VALUE)
				continue;
			for(int jj = ii; jj >=0; jj--)
			{
				int jump = ii-jj;
				if(jump <= (arr[jj]) && jumps[jj]>1+jumps[ii])
				{
					jumps[jj]= 1 + jumps[ii];
				}
			}
		}
		return jumps[0];
	}
}
