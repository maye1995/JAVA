/**
建立一个用于操作数组的工具类，其中包含着常见的对数组的操作，如最值，排序等。
@author  张三
@version  V1.0

*/
class ArrayTool 
{
	private ArrayTool(){}
	//该类中的方法都是静态的，不需要创建对象，所以为了其他用户创建对象，将构造函数私有化。
	/**
	获取整型数组的最大值
	@param arr 接收一个元素类型为int的数组。
	@return  该数组中最大的一个值。
	*/
	public  static int getMax(int[ ] arr)
	{
		int maxIndex =0;
		for (int x =0;x<arr.length ;x++ )
		{
			if (arr[x]>arr[maxIndex])
			{
				maxIndex=x;
			}
		}return arr[maxIndex];
	}
	/**
	对数组进行排序
	@param arr 接收一个元素类型为int的数组。
	
	*/
	public static void selectSort(int [ ]arr)
	{
		for (int x=0;x<arr.length-1;x++ )
		{
			for (int y=x+1;y<arr.length ;y++ )
			{
				if (arr[x]>arr[y])
					swap(arr,x,y);
			}
		}
	}
	/**
	用于对数组进行元素位置置换
	@param arr 接收一个元素类型为int的数组。
	@param a
	@param a
	
	*/
	private static void swap(int [] arr,int a,int b)
	{
		int temp =arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	/**
	对数组进行查找位置
	@param arr 接收一个元素类型为int的数组。
	@param key 接收一个要查找的整型元素数值
	@return  x  返回要查找元素的角标位置
	*/
	public static int getIndex(int[ ] arr,int key)
	{
		for (int x=0;x<arr.length ;x++ )
		{
			if(arr[x]==key)
				return x;
				
		}
		return -1;
	}
	/**
	对数组进行将数组变为字符串
	@param arr 接收一个元素类型为int的数组。
	@return 返回该数组的字符串表现形式。
	*/
	public static String arrayToString(int [] arr)
	{
		String str ="";
		for (int x=0;x<arr.length ;x++ )
		{
			str=str+arr[x]; 
		}
		return str;
	}

}
