import java.io.*;
import java.util.*;
public class Solution {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("file"));
		Scanner stdin = new Scanner(System.in);
		int N, K;
		N = stdin.nextInt();
		K = stdin.nextInt();
		List<Integer> toys = new ArrayList<Integer>();
		for(int ii = 0; ii < N; ii++)
		{
			toys.add(stdin.nextInt());
		}
		Collections.sort(toys);
		
		int sum = 0;
		int numtoys=0;
		for(int ii =0; ii < N; ii++)
		{
			sum += toys.get(ii);
			if(sum <= K)
				numtoys = ii+1;
			else
				break;
		}
		System.out.println(numtoys);
	}

}