class ArrayDemo4 
{
	public static void main(String[] args) 
	{
		int [] arr ={32,23,42,13,54,64,74};
		System.out.println("排序前");
		printArray(arr);
		
		selectSort(arr);
		System.out.println("选择排序后：");
		printArray(arr);

		bubbleSort(arr);
		System.out.println("冒泡排序后：");
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
					swap(arr,y,x);
					/*int temp =arr[x];
					arr[x]=arr[y];
					arr[y]=temp;*/
				}
			}
		}
		}

		//冒泡排序
		public static void bubbleSort(int [] arr)
	{
			for (int x=0;x<arr.length-1;x++ )
			{
				for (int y=0;y<arr.length-1-x ;y++ )
				{
					if (arr[y]>arr[y+1])
					{
						swap(arr,y,y+1);
						/*int temp = arr[y];
						arr[y]=arr[y+1];
						arr[y+1]=temp;*/
					}
				}
			}
		}

		//换位功能
		public static void swap(int []arr,int a,int b)
		{
						int temp = arr[a];
						arr[a]=arr[b];
						arr[b]=temp;
		}
}
