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
	Person(String n)
	{
		name =n;
		
	}
	public void setName(String n)
	{
		name=n ;
	}
	Person(String n,int a)
	{
		if (a<0)
		return;
		name =n;
		age =a;
	}
	public void speak()
	{
		System.out.println(name+":"+age);
	}
}


class  ConsDemo
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		p.speak();
		Person p1 = new Person("����");
		p1.speak();

		Person p2 = new Person("����2",3);
		p2.speak();
		
		//���캯���������������ʱ���õĺ�����
		//���ã����Ը�������г�ʼ����
		//�������󶼱���Ҫͨ�����캯����ʼ����

		//һ���������û�ж�������캯������ô�����л�����i��
		//Ĭ�ϵĿղ����Ĺ��캯����

		//һ�㺯���͹��캯��������
		/*
		���캯�������󴴽�ʱ���ͻ������֮��Ӧ�Ĺ��캯�������г�ʼ����
		һ�㺯�������󴴽�����Ҫ��������ʱ�ŵ��á�

		���캯�������󴴽�ʱ����ֻ����һ�Ρ�
		һ�㺯�������󴴽��󣬿��Ա����ö�Ρ�
		*/

		/*
		ʲôʱ���幹�캯���أ�

		����������ʱ��������һ���ھ;߱���һЩ���ݣ���Щ���ݶ������ڹ��캯���С�

		
		*/
	}
}