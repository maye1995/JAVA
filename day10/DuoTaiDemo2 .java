class ����ү
{
	void ����()
	{
		System.out.println("����!");
	}
	void ����()
	{
		System.out.println("����!");
	}
}

class ����ʦ extends ����ү
{
	void ����()
	{
		System.out.println("java!");
	}
	void ����Ӱ()
	{
		System.out.println("����Ӱ!");
	}
}

class DuoTaiDemo2 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
//		����ʦ  x =new ����ʦ();
//		x.����();
//		x.����Ӱ();

		����ү   x =new ����ʦ();
		x.����();
		x.����();

		����ʦ y =(����ʦ)x;
		y.����Ӱ();
	}
}