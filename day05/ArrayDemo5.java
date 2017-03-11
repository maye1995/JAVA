/*
面试题：
给定一个有序的数组，如果往数组里存储一个元素，并保证这个数组还是有序的。
那么这个元素的角标如何获取。 
{13,15,19,28,33,45,78,106}
*/
import java.util.*;

class ArrayDemo5 
{
	public static void main(String[] args) 
	{
		//int [ ] arr ={2,3,34,32,5,5,9,0,3};
		int [ ]arr={13,15,19,28,33,45,78,106};
		//int index =getIndex(arr,10);
		int index = halfSearch_2(arr,45);
		System.out.println("要查找的元素是第"+index+"个");

		int index1=Arrays.binarySearch(arr,45);
		System.out.println("要查找的元素是第"+index1+"个");
	}
	/*
	数组常见功能：查找
	*/

	//二分查找法

	public static int halfSearch(int [ ] arr,int key)
	{
		int max,min,mid;
		min =0;
		max=arr.length-1;
		mid=(max+min)/2;

		while (arr[min]!=key)
		{
			if (key>arr[mid])
					min =mid +1;
			else if(key<arr[mid])
					max=mid-1;
			if(max<min)
				return -1;
				
			mid=(max+min)/2;
		}
		return mid;
	}

	public static int halfSearch_2(int [] arr, int key){
		int max,min,mid;
		min = 0;
		max =arr.length-1;

		while (min<=max)
		{
			mid=(max+min)>>1;

			if(key>arr[mid])
				min = mid+1;
			else if(key<arr[mid])
				max =mid-1;
			else
				return mid;
		}
		return min;
	}

	public static int getIndex(int [] arr,int key)
	{
		for (int x=0;x<arr.length ;x++ )
		{
			if (arr[x]==key)
				return x;
		}
		
		//System.out.println("要查找的元素是没有的");
		return -1;
	}
}
