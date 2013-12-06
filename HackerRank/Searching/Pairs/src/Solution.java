import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
		int k = stdin.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int ii = 0; ii< N; ii++)
		{
			list.add(stdin.nextInt());
		}
		HashSet<Integer> set = new HashSet<Integer>();
		int count = 0;
		for(int ii = 0; ii< N; ii++)
		{
			if(set.contains(list.get(ii)))
			{
				count++;
			}
			else
			{
				set.add(Math.abs(k-list.get(ii)));
				set.add(Math.abs(k+list.get(ii)));
			}
		}
		System.out.println(count);

	}

}
