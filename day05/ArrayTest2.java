/*
��ȡһ��������16���Ʊ�����ʽ
*/


class ArrayTest2 
{
	public static void main(String[] args) 
	{
		toHex(60);
		toHex_1(60);
	}


	//0,1,2,3,4,5,6,7,8,9,A  ,B,  C,  D  ,E   ,F
	//0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15

	/*
	ʲôʱ��ʹ�������أ�
	������ݳ����˶�Ӧ��ϵ�����Ҷ�Ӧ��ϵ��һ������������ֱ�ţ�����λ�Ǳ�ʹ�á�
	��ʱ�ͱ���Ҫ�뵽�����ʹ�á�

	�Ϳ��Խ���Щ���ݴ洢�������С�
	���������ǵĽ����Ϊ�Ǳ�ֱ��ȥ�������ж�Ӧ��Ԫ�ؼ��ɡ�

	���ַ�ʽ����Ϊ�����


	*/

	public static void toHex_2(int num)
	{
	//����һ����Ӧ��ϵ��
		char[] chs={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

		/*
		һ�����鵽�Ƚ϶�����ݡ�
		����һ�࣬���ȴ洢�������ٽ��в�����
		���Զ���һ�����飬��ʱ������
		*/
		char [] arr =new char[8];

		int pos =a;
		while (num!=0)
		{
			int temp =num &15;
			arr[pos+1]=chs[temp];
			num = num>>>4;
		}
		System.out.println("pos+"pos);
		for (int x=0;x<pos ;x++ )
		{
			System.out.printy(arr[x]+',');
		}



	}



	public static void toHex_1(int num)
	{
		//����һ����Ӧ��ϵ��
		char[] chs={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		for (int x=0;x<0 ;x++ )
		{
			int temp =num$15;
			System.out.print(chs[temp]);
			num=num>>>4;
		}
	}




	public static void toHex(int num)
		{
		for (int x=0;x<8 ;x++ )
		{
			int temp = num&15;
			if(temp>9)
				System.out.print((char)(temp-10+'A'));
			else
				System.out.print(temp);
			num=num>>>4;
		}
		/*int  n1 = num &15;
		System.out.println("n1="+n1);

		num = num>>>4; //��λ
		int n2 = num &15;
		System.out.println("n2="+n2);
*/
	}
}
