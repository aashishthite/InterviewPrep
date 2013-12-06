import java.util.*;
public class Solution
{
	public static void main(String[] args)
	{
		int[][] mat = {{1,14,25,35},{2,16,28,38},{5,20,28,40},{16,22,38,41}};
		bSearch(mat, 38);
		bSearch(mat, 35);
		bSearch(mat, 24); 
		bSearch(mat, 20);
	}
	public static void bSearch(int[][] mat, int n)
	{
		System.out.print(n+ " ");
		int maxX=mat[1].length-1,maxY=mat.length-1,minX=0,minY=0;
		if(n>mat[maxY][maxX] || n< mat[0][0]){
			System.out.println("not present");
			return;
		}
		while(maxX>minX)
		{
			int midX = (maxX+minX)/2;
		/*	if(n == mat[maxY][midX])
			{
				System.out.println("found at :"+ maxY + " "+ midX);
				return;
			}*/
			if(n>mat[minY][midX] && n< mat[maxY][midX])
			{
				maxX= minX= midX;
				break;
			}
			else if(n>mat[maxY][midX])
				minX = midX + 1;
			else
				maxX = midX;		
		}
		while(maxY>minY)
		{
			int midY = (maxY+minY)/2;
			if(n == mat[midY][maxX])
			{
				System.out.println("found at :"+ midY + " " + maxX);
				return;
			}
			if(n > mat[midY][maxX])
				minY = midY + 1;
			else
				maxY = midY;

		}
		if(n == mat[maxY][maxX])
		{
			System.out.println("found at :" + maxY + " " + maxX);
		}
		else
			System.out.println("not present");
				
	}
}
