/*
�Ӹ����еĹ��캯�����ص�

�����๹�����ʱ�����֣��������๹�캯��ʱ������Ҳ�����ˡ�
Ϊʲô��

ԭ���ǣ��������еĹ��캯���е�һ����һ��Ĭ�ϵ���ʽ��䣬super();

�����ʵ�������̣����������еĹ��캯��������ʸ����еĿղ����Ĺ��캯����


Ϊʲô����ʵ����ʱҪ���ʸ����еĿղ������캯����

��Ϊ����̳��˸��࣬��ȡ���˸����е����ݣ����ԣ���������ʹ�ø�������֮ǰ��
Ҫ�ȿ���������ζ��Լ������ݳ�ʼ���ġ�
���Ծ������ڹ������ʱ������Ҫ���ʸ����еĹ��캯����
�ͱ������super()��ʽ��䡣
���������û�ж���ղ������캯������ô����Ĺ��캯������ʹ��super��ȷҪ���ø������ĸ����캯����
ͬʱ���๹�캯�������ʹ����this�����ñ��๹�캯��ʱ��
��ôsuper��û���ˣ���Ϊthis ,super�������ڵ�һ�У�����ֻ����һ����

ע�⣺super������Ҫ���������๹�캯����һ�У���Ϊ�����ʼ�����̱�������ɡ�

*/


class Fu
{

//	int num;
	Fu()
	{
	//	num=10;
		System.out.println("A Hello  Fu!");
	}
	Fu(int x)
	{
		System.out.println("B Hello  Fu!"+x);
	}

}
class Zi extends Fu
{
	Zi()
	{

		//super();//���õľ��Ǹ����еĿղ����Ĺ��캯����

		System.out.println("C Hello  Zi!"+num);
	}

	Zi(int x)
	{
		this();
		//super();
		//super(x);
		System.out.println("D Hello  Zi!"+x);
	}

}

class ExtendsDemo4 
{
	public static void main(String[] args) 
	{
	new Zi(6);
	
	//	System.out.println("Hello World!");
	}
}

class Demo //extends Object
{
	/*
	Demo();
	{
		super();
		return;
	}
	*/
}