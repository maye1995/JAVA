//继承弊端：打破了封装性
/*
final 关键字。
1，final是一个修饰符，可以修饰类方法，变量，类。
2，final修饰得类不可以被继承。
3，final 修饰得方法不可以被覆盖。
4，final修饰得变量量是一个常量，只能赋值一次。


为什么要用final修饰变量。其实在程序中如果一个数据是固定得，
直接使用就可以了，但是阅读性差，所以给该数据起名。
而且这个变量名称得值不能变化，所以加上final固定。


写法规范：常量所有字母都大写，多个单词中间用下划线_连接。



*/


class Fu
{
	final void method()
	{
		//调用了底层系统得资源
	}
}

class Zi extends Fu
{
	public static final double  MY_PI =3.14;

	static final int x=7;
	
	void method()
	{
	final int number =9;
		System.out.println(MY_PI);
	}
}

class FinalDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
