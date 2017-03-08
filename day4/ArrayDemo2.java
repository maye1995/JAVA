class ArrayDemo2 
{
	public static void main(String[] args) 
	{
		//格式一
		/*
		需要一个容器，但不明确容器的具体数据*/
		// int[] arr =new int[3];
		//元素类型[] 数组名 = new 元素类型[]{元素，元素........};
		/*
		需要一个容器，存储一只的具体数据。
		*/	
     //int [] arr =new int[]{89,23,32};
		int [] arr= {89,23,32};
		
	/*
	对数组操作最基本的动作就是存和取。
	核心思想：对角标的操作。
	*/
	//System.out.println(arr[1]);
	//System.out.println("arr["+x+"]=:"+arr[i]+";");//arr[0]=89;
	//正向遍历
	for (int i=0; i<arr.length;i++ )
	{
		System.out.println("arr["+i+"]=:"+arr[i]+";");//arr[0]=89;
	}
	//反向遍历
	for (int i=arr.length-1; i>=0;i-- )
	{
		System.out.println("arr["+i+"]=:"+arr[i]+";");//arr[0]=89;
	}
	}
}
