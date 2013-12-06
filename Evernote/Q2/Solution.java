import java.io.*;

import java.util.*;
class word implements Comparable
{
	public int freq;
	public String name;
	public word(String n, int f)
	{
		this.freq = f;
		this.name = n;
	}
	@Override
	public int compareTo(Object other)
	{
		if(this.freq != ((word)other).freq)
			return this.freq - ((word)other).freq;
		else
			return -this.name.compareTo(((word)other).name);
	}
}
public class Solution
{
	public static void main(String[] args)
	{
		int N,k;
		Scanner stdin = new Scanner(System.in);
		N = Integer.parseInt(stdin.nextLine());
		Map<String,Integer> map = new HashMap<String,Integer>();
		List<String> listOfWords = new ArrayList<String>();
		for(int ii = 0; ii < N; ii++)
		{
			String temp = stdin.nextLine();
			
			if(map.containsKey(temp))
				map.put(temp,map.get(temp)+1);
			else
			{
				map.put(temp,1);
				listOfWords.add(temp);
			}
		} 
		k = Integer.parseInt(stdin.nextLine());
		List<word> topWords = new ArrayList<word>();
		for(int ii = 0; ii < listOfWords.size(); ii ++)
		{
			topWords.add(new word(listOfWords.get(ii),map.get(listOfWords.get(ii))));
		}
		Collections.sort(topWords);
		for(int ii = topWords.size()-1; ii >= topWords.size() - k; ii--)
		{
			System.out.println(topWords.get(ii).name);
		}
	}
}
