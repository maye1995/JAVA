/*
用java语言对现实生活中的事物进行描述。
通过类的方法。

怎么描述呢？
对于事物的描述，通常只关注 属性与行为

对象：其实就是该事物实实在在的个体

类与对象的关系？
类：事物的描述
对象：该类的具体事例，通过new 来创建*/

/*
描述小汽车
分析：
1.属性。

轮胎数。
颜色。

2：行为
运行。

定义类其实就是在定义类中的成员。
成员：成员变量《--》属性，成员变量《--》行为。

成员变量定义在类中。

成员变量和局部变量的区别。
1.成员变量定义在类中，整个类中都咳哟访问。
   局部变量定义在函数，语句，局部代码块，只在所属区域有小


 2.成员变量存在堆内存的对象中。
    局部变量存在于栈内存的方法中

3.成员变量随着对象的创建而存在，随着对象的消失而消失。
局部变量随着区域执行而存在，随着区域的结束而释放。


4.成员变量都有默认的初始化值，
 局部变量没有初始化值。
*/

class Car
{
		int num;
		String color;

		void run()
	{
	//		int num =10;
			System.out.println(num+"..."+color);
	}
}


class  CarDemo
{
	public static void main(String[] args) 
	{

		//在计算机中创建一个Car实例，通过new关键字。
//	Car	c  = new Car();
	//C就是一个类类型的引用变量，指向了该类的对象。
	//c.num=4;
	//c.color="red";
	
	//c.run();
	//要使用对象中的内容可以通过引用对象.成员的形式来完成调用。


		//System.out.println("Hello World!");


		//Car c1= new Car();
		//c1.num=4;
		//c1.Color="red";

		//Car c2= new Car();
		//c2.num=4;
		//c2.Color="red";


		Car c1 =new Car();
		Car c2 =new Car();
		show(c1);


		/*
		匿名对象。没有名字的对象。
		new Car();   //匿名对象，其实就是定义对象的简写形式


		Car c =new Car();
		c.run();

		new  Car().run();


		1.当对象方法仅仅经行一次调用的时候，就可以简化为匿名对象
          

		  new  Car().num=5;
		  new Car().color="green";
		new Car().run();
		

		2.匿名对象可以作为实际参数进行传递。


		show(new Car());
		*/
	}

	//汽车改装厂
	public static void show(Car c)//类类型的变量一定指向对象，要不就是null。
		{
			c.num =3;
			c.color ="black";
			System.out.println(c.num+"..."+c.color);
		}

}
