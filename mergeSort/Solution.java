public class Solution
{
	public static void main(String[] args)
	{
		int[] arr = {5,7,1,6,4};
		mergeSort(arr);
		for(int i =0 ; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

	}
	public static void mergeSort(int[] arr)
	{
		mergeSort(arr,0,arr.length-1);
	}
	public static void mergeSort(int[] arr,int min,int max)
	{
		if(min>=max)
			return;
		int mid = (min+max)/2;
		mergeSort(arr, min, mid);
		mergeSort(arr, mid+1, max);
		mergeSortedArrays(arr,min,mid,max);
	}
	public static void mergeSortedArrays(int[] arr, int min, int mid, int max)
	{
		int[] tempArr = new int[max-min+1];
		int i=min,j=mid+1,k=0;
		while(i<mid+1 && j<max+1)
		{
			if(arr[i]<= arr[j])
			{
				tempArr[k]= arr[i];
				i++;
			}
			else
			{
				tempArr[k]= arr[j];
				j++;
			}
			k++;
		}
		while(i<mid+1)
		{
			tempArr[k]=arr[i];
			i++;
			k++;
		}
		while(j<max+1)
		{
			tempArr[k]=arr[j];
			j++;
			k++;
		}
		j=0;
		for(i=min; i<=max; i++)
		{
			arr[i]=tempArr[j];
			j++;
		}
	}
}
