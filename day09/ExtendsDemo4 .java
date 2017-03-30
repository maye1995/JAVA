/*
子父类中的构造函数的特点

在子类构造对象时，发现，访问子类构造函数时，父类也运行了。
为什么？

原因是：在子类中的构造函数中第一行有一个默认的隐式语句，super();

子类的实例化过程：子类中所有的构造函数都会访问父类中的空参数的构造函数。


为什么子类实例化时要访问父类中的空参数构造函数？

因为子类继承了父类，获取到了父类中的内容（属性），所以在使用父类内容之前，
要先看父类是如何对自己的内容初始化的。
所以就子类在构造对象时，必须要访问父类中的构造函数。
就必须加入super()隐式语句。
如果父类中没有定义空参数构造函数，那么子类的构造函数必须使用super明确要调用父类中哪个构造函数。
同时子类构造函数中如果使用了this来调用本类构造函数时，
那么super就没有了，因为this ,super都必须在第一行，所以只能有一个。

注意：super语句必须要定义在子类构造函数第一行，因为父类初始化过程必须先完成。

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

		//super();//调用的就是父类中的空参数的构造函数。

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