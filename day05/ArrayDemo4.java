class ArrayDemo4 
{
	public static void main(String[] args) 
	{
		int [] arr ={32,23,42,13,54,64,74};
		System.out.println("排序前");
		printArray(arr);
		
		selectSort(arr);
		System.out.println("排序后：");
		printArray(arr);

		
	}
	
	//遍历数组的功能。
	public static void printArray(int[] arr){
		System.out.print("[");
		for (int x=0;x<arr.length ;x++ )
		{
			if(x!=arr.length-1)

				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"]");
		}
	}
	
	//选择排序
	public static void selectSort(int [] arr){
		for (int x =0;x<arr.length-1;x++ )
		{
			for (int y=x+1;y<arr.length ;y++ )
			{
				if (arr[x]>arr[y])
				{
					int temp =arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
				}
			}
		}
		}
}
