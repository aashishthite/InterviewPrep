import java.util.*;
class partition implements Comparable<partition>
{
	int height;
	int index;
	public partition(int h, int i)
	{
		height = h; index = i;
	}
	@Override
	public int compareTo(partition other)
	{
		return this.height - other.height;
	}
}
public class Solution
{
	public static void main(String[] args)
	{
		List<partition> list = new ArrayList<partition>();
		list.add(new partition(3,0));
		list.add(new partition(2,1));
		list.add(new partition(5,2));
		list.add(new partition(4,3));
		list.add(new partition(1,4));
		System.out.println(fill(list));

	}
	public static int fill(List<partition> list)
	{
		Collections.sort(list);
		int minI, maxI;
		minI = maxI = list.get(list.size()-1).index;
		int i = list.size()-1;
		int filled = 0;
		while(minI>0 || maxI<list.size()-1)
		{
			partition temp = list.get(--i);
			if(temp.index > maxI)
			{
				filled += temp.height*(temp.index-maxI);
				maxI=temp.index;
			}
			else if(temp.index < minI)
			{
				filled += temp.height*(minI - temp.index);
				minI = temp.index;
			}
		}
		return filled;
	}
}
