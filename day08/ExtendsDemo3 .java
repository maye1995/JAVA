//��Ա����
/*
���Ӹ����г��ֳ�Ա����һģһ��������������������еĺ�����
�������󣬳�Ϊ���ǲ�������ʱ�������Ӹ����е����ԡ�

�������������ԣ�
		1.���ء�ͬһ�����С�overload
		2.���ǡ������У�����Ҳ��Ϊ��д����д��override

	����ע�����
	1�����෽�����Ǹ��෽��ʱ������Ȩ�ޱ���Ҫ���ڵ��ڸ���Ȩ�ޡ�
	2����ֻ̬�ܸ��Ǿ�̬���򱻾�̬���ǡ�


	ʲôʱ��ʹ�ø��ǲ�����


*/




class Fu
{
	void show1()
	{
		System.out.println("Fu run");
	}
}
class Zi extends Fu
{
	void show2()
	{
		System.out.println("Zi run");
	}
}


class ExtendsDemo3 
{
	public static void main(String[] args) 
	{
		Zi z  =new Zi();
		z.show1();
		z.show2();
		NewPhone p =new NewPhone();
		p.newShow();
		//System.out.println("Hello World!");
	}
}
/*
ʲôʱ��ʹ�ø��ǣ�

����һ��������������չʱ��������Ҫ��������Ĺ�������������Ҫ����������
�ù��ܵ���������ʱ����ʹ�ø��ǹ�����ɡ�

*/

class Phone
{
	void call()
	{
	}
	void show()
	{
		System.out.println("number");
	}
}

class NewPhone extends Phone
{
	void newShow()
	{
		System.out.println("name");
		System.out.println("number");
		System.out.println("pic");
	}

}