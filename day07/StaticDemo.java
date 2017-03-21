class Person
{
	String name;
	String country ="CN";
	public void show()
	{
		System.out.println(country+":"+name);
	}
}

class StaticDemo 
{
	public static void main(String[] args) 
	{
		Person p =new Person();
		p.name="Сǿ";
		p.show();
		//System.out.println("Hello World!");
	}
}
