class ArrayDemo4 
{
	public static void main(String[] args) 
	{
		int [] arr ={32,23,42,13,54,64,74};
		System.out.println("����ǰ");
		printArray(arr);
		
		selectSort(arr);
		System.out.println("ѡ�������");
		printArray(arr);

		bubbleSort(arr);
		System.out.println("ð�������");
		printArray(arr);

		
	}
	
	//��������Ĺ��ܡ�
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
	
	//ѡ������
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

		//ð������
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

		//��λ����
		public static void swap(int []arr,int a,int b)
		{
						int temp = arr[a];
						arr[a]=arr[b];
						arr[b]=temp;
		}
}
