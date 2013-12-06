import java.io.*;
import java.util.*;
public class Solution
{
	static int head, tail;
	public static void main(String[] args) throws Exception
	{
		head = -1; 
		tail = -1;
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int N = Integer.parseInt(line);
		String[] buff = new String[N];
		//	System.out.println(N);
		boolean done =false;
		while(scanner.hasNextLine() && !done)
		{
			line = scanner.nextLine();
			char command = line.charAt(0);
			switch(command)
			{
				case 'A':
					//System.out.println(command);

					Scanner lineScanner = new Scanner(line);
					lineScanner.useDelimiter(" ");
					String tempCommand = lineScanner.next();
					int num = Integer.parseInt(lineScanner.next());
					for(int ii = 0; ii < num; ii++)
					{
						moveHeadIndex(N);
						buff[head%N] = scanner.nextLine();

					}
					break;
				case 'R':
					lineScanner = new Scanner(line);
					lineScanner.useDelimiter(" ");
					tempCommand = lineScanner.next();
					num = Integer.parseInt(lineScanner.next());
					for(int ii = 0; ii < num; ii++)
					{
						if(tail<head)
						{
							moveTailIndex();
						}
					}
					break;
				case 'L':
					int tempint = tail;
					while(head > tempint )
					{
						tempint++;
						System.out.println(buff[tempint%N]);
					}
					break;
				case 'Q':
					done = true;
				default:
			}
							
		}		
	}
	public static void moveHeadIndex(int N)
	{
		head++;
		if(head - tail > N)
			tail++;// = head - 1;
		//return  head%N;
	}
	public static void moveTailIndex()
	{
		tail++;
		//return  tail%N;
	}
}
