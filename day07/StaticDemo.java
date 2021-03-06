class Person
{
	String name;//实例变量，成员变量
	static String country ="CN";//静态变量，类变量
	public static void show()
	{
		System.out.println(country+":"+name);
	}
}
/*
static 特点：
1.static 是一个修饰符，用于修饰成员。
2.被static 修饰的成员，被所有的对象共享。
3.static 优先于对象存在，因为static 的成员随着类的加载就已经存在了。
4.static修饰的成员多了一种调用方式，就可以直接被类名调用。格式： 类名。静态成员
5.static 修饰的数据是共享数据，对象的存储的是特有数据。

成员变量和静态变量的区别？
1.			两个变量的生命周期不同。
			成员变量随着对象的创建而存在，随着对象的回收而释放。
			静态变量会随着类的加载而存在，随着类的消失而消失。

2			调用方式不同。
			成员变量只能被对象调用。
			静态变量可以被对象调用，还可以被类名调用。

3			别名不同
			成员变量也称为实例变量。
			静态变量称为类变量。


4			数据存储位置不同
			成员变量数据存储在堆内存的对象中，所以也叫做对象的特有数据。
			静态变量数据存储在方法区的静态区中，所以也叫对象的共享数据。







*/

class StaticDemo 
{
	public static void main(String[] args) 
	{
		Person p =new Person();
//		p.name="小强";
//		p.show();
		System.out.println(p.country);
		System.out.println(Person.country);//直接被类名调用
	}
}
