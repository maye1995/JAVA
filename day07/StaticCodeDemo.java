/*
��̬�����
������ļ��ض�ִ�У�����ִֻ��һ�Ρ�

���ã�
		���ڸ�����г�ʼ����
*/


class StaticCode
{
	static
	{
		System.out.println("Hello");
	}

	void show()
		{
			System.out.println("show run");
		}
}
class Person
{
	private String name;
	{//�������飬���Ը����ж��󶼳�ʼ����
		System.out.println("Person Run");
		cry();
	}
	Person()//�Ǹ���Ӧ�Ķ����������Եĳ�ʼ����
	{
		name="baby";
		//cry();
	}
	Person(String name)
	{
		this.name=name;
		//cry(); 
	}
	public void speak()
	{
		System.out.println("name:"+name);

		{//�ֲ������
			// �޶��ֲ���������������
		}
	}
	public void cry()
	{
		System.out.println("����:");
	}

}


class  StaticCodeDemo
{
	public static void main(String[] args) 
	{
		Person p1=new Person();
		p1.speak();
		Person p2=new Person("����");
		p2.speak();
		new Person();
		//new StaticCode().show();
		//System.out.println("Hello World!");
	}
}
