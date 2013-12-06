import java.io.*;
import java.util.*;

public class Solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		long[] array = new long[N];
		 long product = 1;
		for(int ii = 0; ii< N; ii++)
		{
			array[ii] = Long.parseLong(scan.nextLine());	
			product *= array[ii];		
		}
		for(int ii = 0; ii < N; ii++)
		{
			if(array[ii] == 0)
			{
				long prod = 1;
				for(int jj = 0; jj < N; jj++)
				{
					if( ii != jj)
						prod *= array[jj];
				} 
				System.out.println(prod);
			}
			else
			{
				System.out.println( array[ii]==0?"0":product/array[ii]);
			}
		}
		
	}
}
