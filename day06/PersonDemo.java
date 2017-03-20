/*
人：
属性：年龄

动作：说话
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
		System.out.println("错误的数据");
		
	}
	*/

	void speak()
	{
		System.out.println("age是"+age);
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
