/*
当成员变量和局部变量重名，可以用关键字this来区分。
this:代表对象。代表哪个对象呢？当前对象。
		this就是所在函数所属对象的引用。
		简单说：哪个对象调用了this 所在的函数，this就代表哪个对象。
*/

class Person
{
	private String name;
	private int age;


	//定义一个Person类的构造函数。
	Person()  //构造函数，而且是空参数的。
	{
		name="baby";
		age=1;
		System.out.println("person run");
	}
	//如果有的孩子一出生就有名字。
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
		Person p =new Person("旺财");
		p.speak();
		Person p1 =new Person("小强");
		p1.speak();
		
	}
}
