class FunctionDemo3 
{
	public static void main(String[] args) 
	{
	//	add(5,3);
	//	draw(3,4);
	print99();
	 getLevel(65);
	}


/*
����1������һ�����ܣ�������������͵Ļ�ȡ��
˼·����Ȼ���幦�ܣ��Ϳ����ú��������֡�
�������һ�������أ�
ͨ��������ȷ����ɡ�
��ȷһ�� ������ܵĽ����ʲô�� �Ǻ͡��ǹ��ܵĽ�������Ըù��ܵķ���ֵ������int.
					��ʵ���������ȷ����ֵ���͡�

��ȷ�����������ʵ�ֹ������Ƿ���Ҫδ֪�������������㣿�У��Ǽ����ͱ�����������Ǻ����Ĳ����б���
					�����������������͡�
					��ʵ��������ȷ�����б���

		ע�⣺����ֵ���ͺͲ�������û��ֱ�ӹ�ϵ��

*/
public static	int add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
		return sum;
	}
/*
����2������һ�����ܣ���һ�����Ρ�

��ȷһ�� ������ܵĽ����ʲô��
					û�����ֱ�Ӵ�ӡ����void��ʾ��
��ȷ�����������ʵ�ֹ������Ƿ���Ҫδ֪�������������㣿
				�У����߲�ȷ������������  int.
*/

public static void draw(int row,int col)
{
	for (int x=1;x<=row ;x++ )
	{
		for (int y=1;y<=col ;y++ )
		{
			System.out.print("*");
		}
	System.out.println();
	}
	return;//��ʡ��
}
/*
����3������һ�����ܣ��Ƚ��������Ƿ���ȡ�
��ȷһ�� ������ܵĽ����ʲô��
					�Ƿ���ȡ��У�boolean��
��ȷ�����������ʵ�ֹ������Ƿ���Ҫδ֪�������������㣿
                    �У���������
*/
public static boolean equals(int a,int b)
	{/*
			if(a==b)
				return true;
			else
				return false;



				*/
			//	return (a==b)?true;false; 

			return a==b;

}


/*
����4������һ�����ܣ���ȡ���������нϴ���Ǹ���
��ȷһ�� ������ܵĽ����ʲô��
					�У����е�һ������int
��ȷ�����������ʵ�ֹ������Ƿ���Ҫδ֪�������������㣿
					��Ҫ������������int
*/

public static int getMax(int a,int b)
	{
		/*if(a>b)
			return a;
		else
			return b;
*/
		return a>b?a:b;
}
	/*
	���幦�ܣ���ӡ99�˷���

	*/

	public static void print99()
		{
		for (int x=1;x<=9 ;x++ )
		{
			for (int y=1;y<=x ;y++ )
			{
					System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}

	/*
	���ݿ��������ȡѧ��������Ӧ�ĵȼ�
	90-100			A
	80-89				B
	70-79				C
	60-69				D
	60����			F
	*/
	public static char getLevel(int point)
	{
		if(point>=90&&point<=100)
			return 'A';
		if(point>=80&&point<=89)
			return 'B';
		if(point>=70&&point<=79)
			return 'C';
		if(point>=60&&point<=69)
			return 'D';
		else
			return 'F';
	}
}