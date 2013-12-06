import java.io.*;

import java.util.*;
public class Solution
{
	public static void main(String[] args)
	{
		int num, size;
		Scanner stdin = new Scanner(System.in);
		num = Integer.parseInt(stdin.nextLine());
		size = Integer.parseInt(stdin.nextLine());
		String arrayString =  stdin.nextLine();
		int[] array = new int[size];
		Scanner lineScanner = new Scanner(arrayString);
		lineScanner.useDelimiter(" ");
		for(int ii = 0; ii < size; ii++)
		{
			array[ii] = Integer.parseInt(lineScanner.next());
		}
		System.out.println(binarySearch(array,num,0,size-1)); 
	}
	public static int binarySearch(int[] array, int num, int low, int high)
	{
		int mid = (low+high)/2;
		
		if(array[mid] == num)
			return mid;
		else if(array[mid] > num)
			return binarySearch(array, num, low, mid-1);
		else
			return binarySearch(array, num, mid+1,high);
	}
}
