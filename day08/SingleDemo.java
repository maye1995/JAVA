/*
���ģʽ����������֮��Ч�Ľ����ʽ����ʵ����һ��˼�롣

1.�������ģʽ��
		��������⣺���ǿ��Ա�֤һ�������ڴ��еĶ���Ψһ�ԡ�

������ڶ������ʹ��ͬһ��������Ϣ����ʱ������Ҫ��֤����Ķ�Ψһ�ԡ�

��α�֤����Ψһ���أ�
1������������������new�����������
2���ڸ����д���һ������ʵ����
3�������ṩһ��������������������Ի�ȡ�ö���

���裺
1��˽�л����๹�캯����
2��ͨ��new �ڱ����д���һ���������
3������һ�����еķ������������Ķ��󷵻ء�




*/
//����ʽ
class Single//��һ���أ�������Ѿ������ˡ�
{
	private static Single s =new Single();  //2��ͨ��new �ڱ����д���һ���������

	private Single(){}    //1��˽�л����๹�캯����
	
	public static Single getInstance() //3������һ�����еķ������������Ķ��󷵻ء�
	{
		return s;
	}
}

//����ʽ
class Single2//�����û�ж���ֻ�е�����getInstance��Żᴴ������
					//�ӳټ�����ʽ��
{
	private static Single s=null;

	private Single(){}

	public static Single f=getInstance()
	{
		if (s==null)
				s=new Single2();
			return s;
		
	}
}
class SingleDemo 
{
	public static void main(String[] args) 
	{
		Single ss =Single.getInstance();
		//System.out.println("Hello World!");
	

//	Test t1 =new Test();
//	Test t2 =new Test();
	Test t1 =Test.getInstance();
	Test t2 =Test.getInstance();
	t1.setNum(10);
	t2.setNum(20);
	System.out.println(t1.getNum());
	System.out.println(t2.getNum());
	}
}


class Test
{
	private int num;

	private Test()    ////1��˽�л����๹�캯����
		{
	}

	private static Test t=new Test(); // //2��ͨ��new �ڱ����д���һ���������

	public static Test getInstance()//3������һ�����еķ������������Ķ��󷵻ء�
	{
		return t;
	}

	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
}