/*
�̳еĺô���
1.��ߴ���ĸ�����
2.��������֮�������ϵ����������������̬�ṩ��ǰ�ᡣ


java��֧�ֵ��̳У���ֱ��֧�ֶ�̳У�����c++�еĶ�̳л��ƽ��и�����

���̳У�һ������ֻ����һ��ֱ�Ӹ��ࡣ

��̳�:һ����������ж��ֱ�Ӹ��ࣨjava�в����������и�����
				��ֱ��֧������Ϊ�ุ��������ͬ��Աʱ����������õĲ�ȷ���ԡ�
				��java��ͨ������ʵ�֡��ķ�ʽ���֡�

java֧�ֶ�㣨���أ��̳С�

			C�̳�B��B�̳�A
			�ͻ���ּ̳���ϵ��
			��Ҫʹ��һ���̳���ϵʱ��
			1���鿴����ϵ�еĶ����࣬�˽����ϵ�Ļ������ܡ�
			2��������ϵ�е������������ɹ��ܵ�ʹ�á�

class Demo
{
	void show1(){}
}

class DemoA Extends Demo
{
	void show1(){}
	void show2()[}
}

class DemoB extends DemoA
{
	void show1(){}
	void show3(){}


ʲôʱ����̳��أ�

��������֮�����������ϵʱ���Ͷ���̳С�

������ϵ��  is  a ��ϵ��





}
*/
/*
class A
{
	void show()
	{
		System.out.println("a");
	}
}

class B
{
	void show()
	{
		System.out.println("b");
	}
}

class C extends A,B
{

}

//������ȷ����new C().show();
*/
class Person
{
	String name;
	int age;
}



class Student extends /*�̳�*/Person
{
//	String name;
//	int age;
	void study()
	{
		System.out.println(age+"���"+name+"Study So Hard!");
	}
}

class Worker extends Person
{
//	String name;
//	int age;
	void work()
	{
		System.out.println("Work World!");
	}
}




class  ExtendsDemo
{
	public static void main(String[] args) 
	{
		Student s =new Student();
		s.name ="����";
		s.age=20;
		s.study();
		//System.out.println("Hello World!");
	}
}