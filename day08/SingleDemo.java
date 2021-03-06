/*
设计模式：对问题行之有效的解决方式，其实他是一种思想。

1.单例设计模式。
		解决的问题：就是可以保证一个类在内存中的对象唯一性。

比如对于多个程序使用同一个配置信息对象时，就需要保证对象的额唯一性。

如何保证对象唯一性呢？
1，不允许其他程序用new创建该类对象。
2，在该类中创建一个本类实例。
3，对外提供一个方法，让其他程序可以获取该对象。

步骤：
1，私有化该类构造函数。
2，通过new 在本类中创建一个本类对象。
3，定义一个共有的方法，将创建的对象返回。




*/
//饿汉式
class Single//类一加载，对象就已经存在了。
{
	private static Single s =new Single();  //2，通过new 在本类中创建一个本类对象。

	private Single(){}    //1，私有化该类构造函数。
	
	public static Single getInstance() //3，定义一个共有的方法，将创建的对象返回。
	{
		return s;
	}
}

//懒汉式
class Single2//类加载没有对象，只有调用了getInstance后才会创建对象。
					//延迟加载形式。
{
	private static Single s=null;

	private Single(){}

	public static Single f=getInstance()
	{
		if (s==null)
				s=new Single2();
			return s;
		
	}
}
class SingleDemo 
{
	public static void main(String[] args) 
	{
		Single ss =Single.getInstance();
		//System.out.println("Hello World!");
	

//	Test t1 =new Test();
//	Test t2 =new Test();
	Test t1 =Test.getInstance();
	Test t2 =Test.getInstance();
	t1.setNum(10);
	t2.setNum(20);
	System.out.println(t1.getNum());
	System.out.println(t2.getNum());
	}
}


class Test
{
	private int num;

	private Test()    ////1，私有化该类构造函数。
		{
	}

	private static Test t=new Test(); // //2，通过new 在本类中创建一个本类对象。

	public static Test getInstance()//3，定义一个共有的方法，将创建的对象返回。
	{
		return t;
	}

	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
}
