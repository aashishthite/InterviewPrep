import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;


public class Solution {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("file1"));
		Scanner stdin = new Scanner(System.in);
		int N = stdin.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		for(int ii = 0; ii< N; ii++)
		{
			arr.add(stdin.nextInt());
		}
		Collections.sort(arr);
		double minDiff = Double.POSITIVE_INFINITY;
		for(int ii = 0; ii < N-1; ii++)
		{
			double diff = Math.abs(arr.get(ii)-arr.get(ii+1));
			if(diff<minDiff)
				minDiff = diff;
		}
		for(int ii = 0; ii < N-1; ii++)
		{
			double diff = Math.abs(arr.get(ii)-arr.get(ii+1));
			if(diff==minDiff)
				System.out.print(arr.get(ii) + " " + arr.get(ii+1) + " ");
		}
	}

}
