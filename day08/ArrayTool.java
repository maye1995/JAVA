class ArrayTool 
{
	/**
	获取整型数组的最大值
	*/
	public  int getMax(int[ ] arr)
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

	public void selectSort(int [ ]arr)
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

	private void swap(int [] arr,int a,int b)
	{
		int temp =arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

	public int getIndex(int[ ] arr,int key)
	{
		for (int x=0;x<arr.length ;x++ )
		{
			if(arr[x]==key)
				return x;
				
		}
		return -1;
	}
	public String arrayToString(int [] arr)
	{
		String str ="";
		for (int x=0;x<arr.length ;x++ )
		{
			str=str+arr[x]; 
		}
		return str;
	}

}
