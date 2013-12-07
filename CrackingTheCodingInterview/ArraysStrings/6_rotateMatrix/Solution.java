import java.util.*;
public class Solution
{
	public static void main(String[] args)
	{
		int[][] arr1= {{11,22,33,44},
				{55,66,77,88},
				{12,24,36,48},
				{13,26,39,52}};
		int[][] arr2= {{20,30,40},
				{34,24,54},
				{98,78,28}};
		for(int ii = 0; ii <arr1.length; ii++)
		{
			for(int jj =0; jj <arr1.length; jj++)
			{
				System.out.print(arr1[ii][jj] + "\t");
			}
			System.out.println();
		}
		rotateM(arr1);
		System.out.println();
		for(int ii = 0; ii <arr1.length; ii++)
		{
			for(int jj =0; jj <arr1.length; jj++)
			{
				System.out.print(arr1[ii][jj] + "\t");
			}
			System.out.println();
		}
	}
	public static void rotateM(int[][] arr)
	{
		int layer = 0;
		int n = arr.length;
		while(layer<n/2)
		{
			int first = layer;
			int last = n - layer - 1;
			for(int i = first; i<last; i++)
			{
				int temp = arr[i][last];
				arr[i][last]=arr[first][i];
				int temp1 = arr[last][last-i];
				arr[last][last-i] = temp;
				temp = arr[last-i][first];
				arr[last-i][first]= temp1;
				arr[first][i] = temp;
			}
			layer++;
		}
	}
}
