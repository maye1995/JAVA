//成员函数
/*
当子父类中出现成员函数一模一样的情况，会运行子类中的函数。
这种现象，称为覆盖操作。这时函数在子父类中的特性。

函数的两个特性：
		1.重载。同一个类中。overload
		2.覆盖。子类中，覆盖也成为重写，覆写。override

	覆盖注意事项：
	1，子类方法覆盖父类方法时，子类权限必须要大于等于父类权限。
	2，静态只能覆盖静态，或被静态覆盖。


	什么时候使用覆盖操作？


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
什么时候使用覆盖？

当对一个类进行子类的拓展时，子类需要保留父类的功能声明，但是要定义子类中
该功能的特有内容时，就使用覆盖功能完成。

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