abstract class AbsDemo
{
	abstract void show1();
	abstract void show2();
}


/*
当一个抽象类中的方法都是抽象的时候，这时可以讲该抽象类用另一种形式定义
就是接口：interface

//定义接口使用的关键字不是class,是interface.
	对于接口当中常见的成员：而且这些成员都有固定的修饰符。
	1，全局常量。public static final
	2，抽象方法。public abstract

	由此得出结论：接口中的成员都是公用的权限。

*/

interface Demo
{
	public static final int NUM=4;	

	public	abstract void show1();
	public	abstract void show2();
}
//类与类之间是继承关系，类与接口之间是实现关系。

/*
接口不可以实例化。

只能由实现了接口的子类并覆盖了接口中所有的抽象方法后，该子类才可以实例化。
否则，这个子类就是一个抽象类。

*/
class DemoImpl implements /*实现*/Demo
{
	public void show1()
	{}
	public void show2()
	{}
}
/*
在java中不直接支持多继承，因为会出现调用的不确定性。
所以java将多继承机制进行了改良，在java中变成了多实现。

一个类可以实现多个接口。




*/


interface A
{
	public void show();
}
interface Z
{
	public int add(int a,int b);
}


class Test implements A,Z   //多实现
{
	//public  void show()
	/*public int add(int a,int b)
	{
		return a+b;
	}*/
}

/*
一个类在继承宁一个类的同时，还可以实现多个接口。


*/

class Q
{
	public void method()
	{}
}
abstract class Test2 extends Q implements A,Z
{
}
/*
接口的出现避免了单继承的局限性。

*/

interface CC
{
	void show();
}
interface MM
{
	void method();
}
interface QQ extends CC,MM //接口与接口之间是继承关系，而且接口可以多继承。
{
}


class InterfaceDemo 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");

		Test t =new Test();
		t.show();
//		DemoImpl d=new DemoImpl();
	//	System.out.println(d.NUM);
		//System.out.println(DemoImpl.NUM);
		//System.out.println(Demo.NUM);
	}
}
