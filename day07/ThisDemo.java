/*
����Ա�����;ֲ����������������ùؼ���this�����֡�
this:������󡣴����ĸ������أ���ǰ����
		this�������ں���������������á�
		��˵���ĸ����������this ���ڵĺ�����this�ʹ����ĸ�����
*/

class Person
{
	private String name;
	private int age;


	//����һ��Person��Ĺ��캯����
	Person()  //���캯���������ǿղ����ġ�
	{
		name="baby";
		age=1;
		System.out.println("person run");
	}
	//����еĺ���һ�����������֡�
	Person(String name)
	{
		this.name =name;
	}
	Person(String name,int age)
	{
		
		this.name =name;
		this.age =age;
	}
	public void speak()
	{
		System.out.println(name+":"+age);
	}
}

class  ThisDemo
{
	public static void main(String[] args) 
	{
		Person p =new Person("����");
		p.speak();
		Person p1 =new Person("Сǿ");
		p1.speak();
		
	}
}
