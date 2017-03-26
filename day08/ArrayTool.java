/**
����һ�����ڲ�������Ĺ����࣬���а����ų����Ķ�����Ĳ���������ֵ������ȡ�
@author  ����
@version  V1.0

*/
class ArrayTool 
{
	private ArrayTool(){}
	//�����еķ������Ǿ�̬�ģ�����Ҫ������������Ϊ�������û��������󣬽����캯��˽�л���
	/**
	��ȡ������������ֵ
	@param arr ����һ��Ԫ������Ϊint�����顣
	@return  ������������һ��ֵ��
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
	�������������
	@param arr ����һ��Ԫ������Ϊint�����顣
	
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
	���ڶ��������Ԫ��λ���û�
	@param arr ����һ��Ԫ������Ϊint�����顣
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
	��������в���λ��
	@param arr ����һ��Ԫ������Ϊint�����顣
	@param key ����һ��Ҫ���ҵ�����Ԫ����ֵ
	@return  x  ����Ҫ����Ԫ�صĽǱ�λ��
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
	��������н������Ϊ�ַ���
	@param arr ����һ��Ԫ������Ϊint�����顣
	@return ���ظ�������ַ���������ʽ��
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
