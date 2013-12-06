import java.util.*;

public class Solution
{
	public static void main(String[] args)
	{
		char[][] matrix ={
			{'i','l','o','v','e'},
			{'d','i','n','t','e'},
			{'n','e','w','e','p'},
			{'a','i','v','r','i'},
			{'m','a','x','e','c'}};
		printSpiral(matrix);
	}
	public static void printSpiral(char[][] matrix)
	{
		StringBuilder sb = new StringBuilder();
		int l  = matrix.length;
		int layer = 0;
		while(layer < matrix.length/2+1)
		{
			int i = layer, j = layer;
			for(int ii = i; ii < l-layer; ii++)
				sb.append(matrix[layer][ii]);
			for(int ii = j+1; ii < l-layer; ii++)
				sb.append(matrix[ii][l-layer-1]);
			for(int ii = l-layer-2; ii >= layer; ii--)
				sb.append(matrix[l-layer-1][ii]);
			for(int ii = l-layer-2; ii > layer; ii--)
				sb.append(matrix[ii][layer]);
			layer++; 
		}
		System.out.println(sb.toString());
	}
}
