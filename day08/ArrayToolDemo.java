class ArrayToolDemo
{

	/*保证程序的独立运行*/
	public static void main(String[] args) 
	{
		int [] arr={1,3,4,5,6,6,7,9};
		//ArrayTool tool =new ArrayTool(); 
		int max=ArrayTool.getMax(arr);
		System.out.println("最大值是"+arr[maxIndex]);

		int max=ArrayTool.getIndex(arr,10);
		System.out.println("index"+index);
		//System.out.println("Hello World!");
	}
	/**
	获取整型数组的最大值
	
	public static int getMax(int[ ] arr)
	{
		int maxIndex =0;
		for (int x =0;x<arr.length ;x++ )
		{
			if (arr[x]>arr[maxIndex])
			{
				maxIndex=x;
			}return arr[maxIndex];
		}
	}*/
}
