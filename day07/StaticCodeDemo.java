/*
静态代码块
随着类的加载而执行，而且只执行一次。

作用：
		用于给类进行初始化。
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
	{//构造代码块，可以给所有对象都初始化。
		System.out.println("Person Run");
		cry();
	}
	Person()//是给对应的对象进行针对性的初始化，
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

		{//局部代码块
			// 限定局部变量的生存周期
		}
	}
	public void cry()
	{
		System.out.println("哇哇:");
	}

}


class  StaticCodeDemo
{
	public static void main(String[] args) 
	{
		Person p1=new Person();
		p1.speak();
		Person p2=new Person("旺财");
		p2.speak();
		new Person();
		//new StaticCode().show();
		//System.out.println("Hello World!");
	}
}
