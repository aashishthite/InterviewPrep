import java.io.*;

import java.util.*;
public class Solution
{
	public static void main(String[] args)
	{
		int testCases, num, size;
		Scanner stdin = new Scanner(System.in);
		testCases = Integer.parseInt(stdin.nextLine());
		//size = Integer.parseInt(stdin.nextLine());
		while(testCases > 0)
		{
			testCases--;
			String arrayString =  stdin.nextLine();
			Scanner lineScanner = new Scanner(arrayString);
			lineScanner.useDelimiter(" ");
			size =Integer.parseInt( lineScanner.next());	
			List<Integer> A = new ArrayList<Integer>();
			List<Integer> B = new ArrayList<Integer>();
			num = Integer.parseInt(lineScanner.next());
			arrayString = stdin.nextLine();
			lineScanner = new Scanner(arrayString);
			lineScanner.useDelimiter(" ");
			for(int ii = 0; ii < size; ii++)
			{
				A.add(Integer.parseInt(lineScanner.next()));
			}
			arrayString = stdin.nextLine();
			lineScanner = new Scanner(arrayString);
			lineScanner.useDelimiter(" ");
			for(int ii = 0; ii < size; ii++)
			{
				B.add(Integer.parseInt(lineScanner.next()));
			}
			
			Collections.sort(A);
			Collections.sort(B);

			if(A.get(0)+B.get(0) < num)
			{
				System.out.println("NO");
			}
			else
				System.out.println("YES");
		} 
	}
}