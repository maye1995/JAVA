/*
public static void main(String[] args) 


����������֮����
1.��ʽ�ǹ̶��ġ�
2.��jvm��ʶ��͵��á�

public:��ΪȨ�ޱ������ġ�
static:������ڵ�����������ʱ����Ҫ����ֱ���������������������ü��ɡ�
void:������û�о���ķ���ֵ��
main:�����������ǹؼ��֣�ֻ��һ��jvmʶ��Ĺ̶������֡�
String[] args:�����������Ĳ����б�����һ���������͵Ĳ���������Ԫ�ض����ַ������͡�




*/


class MainDemo 
{
	public static void main(String[] args) //new String[0]
	{
		System.out.println(args);// [Ljava.lang.String;@659e0bfd
		System.out.println(args.length);//0
	}
}