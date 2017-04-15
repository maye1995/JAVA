/*
对象的多态性。

class 动物
{}

class 猫 extends 动物
{}

class 狗 extends 动物
{}

猫 x =new 猫();

动物 x =new 猫();   //一个对象两种形态

猫这类事物既具有猫的形态，又具备动物的形态。
这就是对象的多态性。

简单说：就是一个对象对应着不同类型

多态在代码中的体现
	父类或者接口的引用指向其子类的对象。


多态的好处：
	提高了代码的拓展性，前期定义的代码可以使用后期的内容。


多态的弊端：
		前期定义的内容不能使用后期子类的特有内容。

多态的前提：
		1.必须有关系，继承，实现。
		2.要有覆盖。


*/

abstract class Animal
{
	abstract void eat();
}

class Dog extends Animal
{
	void eat()
	{
		System.out.println("啃骨头");
	}
	void lookHome()
	{
		System.out.println("看家护院");
	}
}

class Cat extends Animal
{
	void eat()
	{
		System.out.println("吃鱼");
	}
	void catchMouse()
	{
		System.out.println("抓老鼠");
	}
}

class Pig extends Animal()
{
	void eat()
	{
		System.out.println("吃饲料");
	}
	void gongdi()
	{
		System.out.println("拱地");
	}
}

class DuoTaiDemo
 
{
	public static void main(String[] args) 
	{




//		Cat c=new Cat();
//		c.eat();
//		c.catchMouse();

		Animal a=new Cat();//自动类型提升没，猫对象类型提升了动物类型，但特有功能无法访问。
											//作用就是限制对特有功能的访问。
											//专业讲：向上转型。
		a.eat();

		//如果还想用猫的特有功能。
		//你可以将该对象进行向下转型。
		Cat c =(Cat)a;//向下转型的目的是为了使用子类中的特有方法。
		c.eat();
		c.catchMouse();


//		注意：对于转型，自始至终都是子类对象在做着类型的变换。

	/*	Animal a1=new Animal();
		Cat c1=(Cat)a;

		Animal a2=new Dog();
		Cat c2=(Cat)a2;
*/


		/*//System.out.println("Hello World!");
		Cat c =new Cat();
		//c.eat();
		method(c);

		Dog d =new Dog();
		method(d);

		method(new Pig());
*/
	}
	public static void method(Animal a)//Animal a=new Dog();
	{
		a.eat();
		a.catchMouse();
	}
/*
	public static void method(Cat c)
	{
		c.eat();
	}

	public static void method(Dog d)
	{
		d.eat();
	}
	*/
}
