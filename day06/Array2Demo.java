/*
��ά����Ķ����ʽ
*/

class Array2Demo 
{
	public static void main(String[] args) 
	{


		//int [ ] arr =new int [3];
		int sum =0
		int [][] arr=new int [3][2];//����һ����ά���飬����������3��һά���飬ÿһ��һά������������Ԫ�ء�


		System.out.println(arr);//ֱ�Ӵ�ӡ��ά����
		System.out.println(arr[0]);//ֱ�Ӵ�ӡ��ά�����нǱ�Ϊ0��һά����
		System.out.println(arr[0][0]);//ֱ�Ӵ�ӡ��ά�����нǱ�Ϊ0��һά�����нǱ�Ϊ0��Ԫ��

		int  [] [] arr ={{3,1 },{3,2,4 },{3,9,0}};
		for (int x=0;x<arr.length ;x++ )
		{
			for (int y=0;y<arr[x] ;y++ )
			{
					System.out.println(arr[x][y]+",");
					sum =+arr[x][y];
			}
			
		}
			System.out.println("sum"+sum);



//			�ף�30,59,28,17
	//			�ң�37��60��22��19
				int []arr = {{30,59,28,17},{37,60,22,19}};
	}
}
