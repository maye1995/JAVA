/*
���󣺺���������
*/

class FunctionDemo4 
{
	public static void main(String[] args) 
	{	
		add(4,4);
		add(2.4,3.4);
		add(1,3,6);
		//System.out.println("Hello World!");
		printCFB();
	}

	/*
	����������
	1.ͬһ����
	2 ͬ��
	3 ��������  ���߲������Ͳ�ͬ��
	4 �������غͷ���ֵ�����޹ء�
	5����������ֵ��õò�ȷ���ԣ������ʧ�ܡ�
	*/

	
	//�ӷ����㡣���������ú�
	public static int add(int a,int b){
		return a+b;
	}

	//�ӷ����㡣����С���ú�
	public static double add(double a,double b){
		return a+b;
	}

	//�ӷ����㡣���������ú�
	public static int add(int a,int b,int c){
		return add(a,b)+c;
	}

	/*
	��ӡ�˷���
	*/
	public static void printCFB(int num){
		for (int x = 1;x<=num ;x++ )
		{
			for (int y =1;y<=x ;y++ )
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
	/*
	��ӡ��׼�˷���
	*/
	public static void printCFB(){
		printCFB(9);
		}
	}
}