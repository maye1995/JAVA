/*
�ˣ�
���ԣ�����

������˵��
*/
class Person
{
	private int age;

	public void setAge(int a)
	{
		age =a;
	}
	public int getAge(int a)
	{
		return age;
	}
/*
	public void haha(int a)
	{
		if (a>0&&a<130){
		age =a;
		speak();
		}
		else
		System.out.println("���������");
		
	}
	*/

	void speak()
	{
		System.out.println("age��"+age);
	}
}

class  PersonDemo
{
	public static void main(String[] args) 
	{
		Person p =new Person();
		//p.age =20;
		p.haha(20);
		//p.speak();
	}
}
