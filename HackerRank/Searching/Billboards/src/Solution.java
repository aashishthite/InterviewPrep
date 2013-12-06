import java.io.*;
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
		int K = stdin.nextInt();
		List<Integer> bb = new ArrayList<Integer>();
		for(int ii = 0; ii <N; ii++)
		{
			bb.add(stdin.nextInt());
		}
		List<Integer> newBB = new ArrayList<Integer>(bb);
		Collections.sort(bb);
		boolean[] isThere = new boolean[N];
		
		for(int ii = 0; ii < N; ii++)
			isThere[ii] = false;
		
		for(int ii = N-1; ii >= 0; ii--)
		{
			int indx = newBB.indexOf(bb.get(ii));
			int indxL = 0, indxR = 0;
			while(indxR-indxL <K)
			{
				boolean r =false, l = false;
				if(indx + indxR +1 < N && isThere[indx+indxR+1] && !r)
				{
					indxR++;
				}
				else
				{
					r = true;
				}
				if(indx - indxL -1 >= 0 && isThere[indx-indxL -1] && !l)
				{
					indxL--;				
				}
				else
				{
					l=true;
				}
				if(l&&r)
					break;
			}
			if(indxR-indxL < K)
			{
				isThere[indx] = true; 
			}
		}
		int sum = 0;
		for(int ii = 0; ii < N; ii++)
		{
			if(isThere[ii])
				sum += newBB.get(ii);
		}
		System.out.println(sum);

	}

}