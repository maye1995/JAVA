class ArrayDemo3 
{
	public static void main(String[] args) 
	{
		int [] arr ={34,13,31,4,2,13,42,43,21};
		int max = getMax(arr);
		System.out.println("max�ǣ�"+max);
		int max2 = getMax2(arr);
		System.out.println("max�ǣ�"+max);
	}


//��������ֵ�Ļ��
/*
˼·��
1.��Ҫ���бȽϣ������������¼סÿ�αȽϺ�ϴ��ֵ��
2.�������е�Ԫ�ؽ��б���ȡ�����ͱ����м�¼��Ԫ�ؽ��бȽ�
		�����������Ԫ�ش��ڱ����м�¼��ֵ�����ñ�����¼ס�ô��ֵ��
3.����������ñ�����¼�������ֵ��

����һ��������ʵ�֡�
������ȷ��
һ�������
		�������е�Ԫ�أ�int
����δ֪���ݣ�
		����
*/
	public static int getMax(int [] arr)
	{
		//�����������¼�ϴ��ֵ
		int maxElement =arr[0];
		for (int x =1;x<arr.length ;x++)
		{
			if (arr[x]>maxElement)
				maxElement=arr[x];
			}
			return maxElement;
	}


	public static int getMax2(int [] arr)
	{
		//�����������¼�ϴ��ֵ
		int maxIndex =0;
		for (int x =1;x<arr.length ;x++)
		{
			if (arr[x]>arr[maxIndex])
				maxIndex=x;
			}
			return maxIndex;
	}
	}