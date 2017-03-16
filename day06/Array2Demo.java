/*
二维数组的定义格式
*/

class Array2Demo 
{
	public static void main(String[] args) 
	{


		//int [ ] arr =new int [3];
		int sum =0
		int [][] arr=new int [3][2];//创建一个二维数组，该数组中有3个一维数组，每一个一维数组中有两个元素。


		System.out.println(arr);//直接打印二维数组
		System.out.println(arr[0]);//直接打印二维数组中角标为0的一维数组
		System.out.println(arr[0][0]);//直接打印二维数组中角标为0的一维数组中角标为0的元素

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



//			甲：30,59,28,17
	//			乙：37，60，22，19
				int []arr = {{30,59,28,17},{37,60,22,19}};
	}
}
