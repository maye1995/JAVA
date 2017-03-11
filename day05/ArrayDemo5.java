/*
�����⣺
����һ����������飬�����������洢һ��Ԫ�أ�����֤������黹������ġ�
��ô���Ԫ�صĽǱ���λ�ȡ�� 
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
		System.out.println("Ҫ���ҵ�Ԫ���ǵ�"+index+"��");

		int index1=Arrays.binarySearch(arr,45);
		System.out.println("Ҫ���ҵ�Ԫ���ǵ�"+index1+"��");
	}
	/*
	���鳣�����ܣ�����
	*/

	//���ֲ��ҷ�

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
		
		//System.out.println("Ҫ���ҵ�Ԫ����û�е�");
		return -1;
	}
}
