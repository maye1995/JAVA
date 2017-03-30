/*
抽象类：

抽象：笼统，模糊。

特点：
1，方法只有声明没有实现时，该方法就是抽象类，需要被abstract修饰。
		抽象方法必须定义在抽象类中，该类也必须被abstract修饰。
2，抽象类不可以被实例化，为什么？  因为调用抽象方法没有意义。

3，抽象类必须有其子类覆盖了所有得抽象方法后，该子类才可以被实例化。
		否则这个子类还是抽象类。



Q。1，抽象类中有构造函数吗？
			
			有，用于给子类对象初始化。

Q.2,抽象类可以不定义抽象方法吗？

		可以的。但是很少见，目的是不让该类创建对象，awt得适配器对象就是这种类。
		通常这个类中得方法有方法体，却没有内容。

		class Demo
		{
			void show1()
			{}
		

			void show2()
			{}
		}

Q.3，抽象关键字不可以和哪些关键字共存？

   private		私有，无法被子类覆盖

   static   静态方法不需要创建对象
   
   final  不能被修改覆盖

Q.4抽象类和一般类得异同点。

	相同点：抽象类和一般类都是用来描述事物的，都在内部定了成员。

	不同点：
		1，一般类有足够的信息描述事物。
				抽象类描述事物得信息有可能不足。
		
		2，一般类中不能定义抽象方法，只能定义非抽象方法。
				抽象类中可以定义抽象方法和非抽象方法。

		3，一般类可以被实例化。
				抽象类不可以被实例化。

Q.5，抽象类一定是父类吗？

			是的。需要子类覆盖其方法后才可以实例化。
*/
abstract class Demo
{
  abstract void show();//抽象函数
	
}
class DemoA extends Demo
{
	void show()
	{
		System.out.println("demoa show!");
	}
}
class DemoB
{
	void show()
	{
		System.out.println("demob show!");
	}
}
class AbstractDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
