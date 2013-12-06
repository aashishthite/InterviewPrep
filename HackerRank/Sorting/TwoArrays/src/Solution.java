import java.io.*;
import java.util.*;
public class Solution {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int testCases, num, size;
		//System.setIn(new FileInputStream("file"));
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
			boolean isit = true;
			for(int ii = 0; ii < size; ii++)
			{
				if(A.get(ii)+B.get(size-1-ii) < num)
					isit = false;
			}
			if(!isit)
			{
				System.out.println("NO");
			}
			else
				System.out.println("YES");
		} 

	}

}
