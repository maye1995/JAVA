/*
���Ӹ����У���Ա���ص����֡�
1.��Ա����
2.��Ա������
3.���캯��
*/

//1.��Ա������
/*
�������еĳ�Ա�;ֲ�����ͬ����this ���֡�

���Ӹ����еĳ�Ա����ͬ��ʱ��super ���֡�

this ��super ���÷������ơ�

this:������һ�������������á�

super:����һ������Ŀռ䡣

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
