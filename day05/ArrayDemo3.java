class ArrayDemo3 
{
	public static void main(String[] args) 
	{
		int [] arr ={34,13,31,4,2,13,42,43,21};
		int max = getMax(arr);
		System.out.println("max是："+max);
		int max2 = getMax2(arr);
		System.out.println("max是："+max);
	}


//数组中最值的获得
/*
思路：
1.需要进行比较，并定义变量记录住每次比较后较大的值。
2.对数组中的元素进行遍历取出，和变量中记录的元素进行比较
		如果遍历到的元素大于变量中记录的值，就用变量记录住该大的值。
3.遍历结果：该变量记录就是最大值。

定义一个功能来实现。
两个明确：
一：结果：
		是数组中的元素，int
二：未知内容：
		数组
*/
	public static int getMax(int [] arr)
	{
		//定义变量，记录较大的值
		int maxElement =arr[0];
		for (int x =1;x<arr.length ;x++)
		{
			if (arr[x]>maxElement)
				maxElement=arr[x];
			}
			return maxElement;
	}


	public static int getMax2(int [] arr)
	{
		//定义变量，记录较大的值
		int maxIndex =0;
		for (int x =1;x<arr.length ;x++)
		{
			if (arr[x]>arr[maxIndex])
				maxIndex=x;
			}
			return maxIndex;
	}
	}