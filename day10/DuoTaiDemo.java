/*
����Ķ�̬�ԡ�

class ����
{}

class è extends ����
{}

class �� extends ����
{}

è x =new è();

���� x =new è();   //һ������������̬

è��������Ⱦ���è����̬���־߱��������̬��
����Ƕ���Ķ�̬�ԡ�

��˵������һ�������Ӧ�Ų�ͬ����

��̬�ڴ����е�����
	������߽ӿڵ�����ָ��������Ķ���


��̬�ĺô���
	����˴������չ�ԣ�ǰ�ڶ���Ĵ������ʹ�ú��ڵ����ݡ�


��̬�ı׶ˣ�
		ǰ�ڶ�������ݲ���ʹ�ú���������������ݡ�

��̬��ǰ�᣺
		1.�����й�ϵ���̳У�ʵ�֡�
		2.Ҫ�и��ǡ�


*/

abstract class Animal
{
	abstract void eat();
}

class Dog extends Animal
{
	void eat()
	{
		System.out.println("�й�ͷ");
	}
	void lookHome()
	{
		System.out.println("���һ�Ժ");
	}
}

class Cat extends Animal
{
	void eat()
	{
		System.out.println("����");
	}
	void catchMouse()
	{
		System.out.println("ץ����");
	}
}

class Pig extends Animal()
{
	void eat()
	{
		System.out.println("������");
	}
	void gongdi()
	{
		System.out.println("����");
	}
}

class DuoTaiDemo
 
{
	public static void main(String[] args) 
	{




//		Cat c=new Cat();
//		c.eat();
//		c.catchMouse();

		Animal a=new Cat();//�Զ���������û��è�������������˶������ͣ������й����޷����ʡ�
											//���þ������ƶ����й��ܵķ��ʡ�
											//רҵ��������ת�͡�
		a.eat();

		//���������è�����й��ܡ�
		//����Խ��ö����������ת�͡�
		Cat c =(Cat)a;//����ת�͵�Ŀ����Ϊ��ʹ�������е����з�����
		c.eat();
		c.catchMouse();


//		ע�⣺����ת�ͣ���ʼ���ն�������������������͵ı任��

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
