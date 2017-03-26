/*
在子父类中，成员的特点体现。
1.成员变量
2.成员函数。
3.构造函数
*/

//1.成员变量。
/*
当本类中的成员和局部变量同名用this 区分。

当子父类中的成员变量同名时用super 区分。

this 和super 的用法很相似。

this:代表了一个本类对象的引用。

super:代表一个父类的空间。

*/
class fu
{
	private	int num=4;

	public int getNum()
	{
		return num;
	}
}

class zi extends fu
{
	private int num=5;
	void show()
	{
		System.out.println(this.num+"......."+super.num);
	}
}




class ExtendsDemo2 
{
	public static void main(String[] args) 
	{
	zi z =new zi();
		z.show();
	
	//	System.out.println("Hello World!");
	}
}
