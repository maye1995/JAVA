class ArrayDemo2 
{
	public static void main(String[] args) 
	{
		//��ʽһ
		/*
		��Ҫһ��������������ȷ�����ľ�������*/
		// int[] arr =new int[3];
		//Ԫ������[] ������ = new Ԫ������[]{Ԫ�أ�Ԫ��........};
		/*
		��Ҫһ���������洢һֻ�ľ������ݡ�
		*/	
     //int [] arr =new int[]{89,23,32};
		int [] arr= {89,23,32};
		
	/*
	���������������Ķ������Ǵ��ȡ��
	����˼�룺�ԽǱ�Ĳ�����
	*/
	//System.out.println(arr[1]);
	//System.out.println("arr["+x+"]=:"+arr[i]+";");//arr[0]=89;
	//�������
	for (int i=0; i<arr.length;i++ )
	{
		System.out.println("arr["+i+"]=:"+arr[i]+";");//arr[0]=89;
	}
	//�������
	for (int i=arr.length-1; i>=0;i-- )
	{
		System.out.println("arr["+i+"]=:"+arr[i]+";");//arr[0]=89;
	}
	}
}
