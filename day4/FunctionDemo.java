class FunctionDemo 
{
	public static void main(String[] args) 
	{
		//int a= 3;
		//int b=4;
		//int c;
		//c=a+b;

		//c=5+7;
		//c=9+8;

		int c= add(3,4);
		System.out.println("c="+c);


		myprint();
	}
	/*
	���庯���ĸ�ʽ

	���η� ����ֵ���� ����������������  ��ʽ����1����������  ��ʽ����2������������
	{
			ִ����䣻
			return ����ֵ��
	}

	�������������û�о���ķ���ֵ

	��ʱreturn����ֱ���÷ֺŽ���
	����ֵ���ͣ���Ϊû�о���ֵ�����Բ�����л�������������
	��java��������һ���ؼ�������ʾ����������ؼ�����void

	�ܽ᣺û�о���ķ���ֵʱ������ֵ������void ��ʾ��
	

	ע�⣺�������ֵ����ʱvoid��return������ʡ�Բ�д��
	*/ 
	public static void myprint(){
		System.out.println("hello java");
		return;
	}


	public static	int add(int a,int b)
	{
		return a+b;
	}
}
