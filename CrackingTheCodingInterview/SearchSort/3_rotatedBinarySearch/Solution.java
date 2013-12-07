import java.util.*;
public class Solution
{
	public static void main(String[] args)
	{
		int[] arr = {15,16,19,20,25,1,3,4,5,7,10,14};
		System.out.println(rotBSearch(arr,15));	
		System.out.println(rotBSearch(arr,20));
		System.out.println(rotBSearch(arr,14));
	}
	public static int rotBSearch(int[] arr, int n)
	{
		return rotBSearch(arr,n,0,arr.length-1);
	}
	public static int rotBSearch(int[] arr, int n, int low, int high)
	{
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(arr[mid] == n)
				return mid;
			if(arr[mid] < arr[high])
			{
				if(n < arr[mid])
					high = mid;
				else if(n <= arr[high])
					low = mid+1;
				else
					high = mid;
			}
			else
			{
				if(n > arr[mid])
					low = mid+1;
				else if(n >= arr[low])
					high = mid;
				else
					low = mid+1;
			}
		
		}
		return -1;

	}

}
