//�̳б׶ˣ������˷�װ��
/*
final �ؼ��֡�
1��final��һ�����η������������෽�����������ࡣ
2��final���ε��಻���Ա��̳С�
3��final ���ε÷��������Ա����ǡ�
4��final���εñ�������һ��������ֻ�ܸ�ֵһ�Ρ�


ΪʲôҪ��final���α�������ʵ�ڳ��������һ�������ǹ̶��ã�
ֱ��ʹ�þͿ����ˣ������Ķ��Բ���Ը�������������
��������������Ƶ�ֵ���ܱ仯�����Լ���final�̶���


д���淶������������ĸ����д����������м����»���_���ӡ�



*/


class Fu
{
	final void method()
	{
		//�����˵ײ�ϵͳ����Դ
	}
}

class Zi extends Fu
{
	public static final double  MY_PI =3.14;

	static final int x=7;
	
	void method()
	{
	final int number =9;
		System.out.println(MY_PI);
	}
}

class FinalDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
