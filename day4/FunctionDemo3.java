class FunctionDemo3 
{
	public static void main(String[] args) 
	{
	//	add(5,3);
	//	draw(3,4);
	print99();
	 getLevel(65);
	}


/*
需求1：定义一个功能，完成两个整数和的获取。
思路：既然定义功能，就可以用函数来体现。
如何体验一个函数呢？
通过两个明确来完成。
明确一： 这个功能的结果是什么？ 是和。是功能的结果，所以该功能的返回值类型是int.
					其实这就是在明确返回值类型。

明确二：这个功能实现过程中是否需要未知参数来参与运算？有，是加数和被加数。这就是函数的参数列表。
					参数个数，参数类型。
					其实就是在明确参数列表。

		注意：返回值类型和参数类型没有直接关系。

*/
public static	int add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
		return sum;
	}
/*
需求2：定义一个功能，画一个矩形。

明确一： 这个功能的结果是什么？
					没结果，直接打印，用void表示。
明确二：这个功能实现过程中是否需要未知参数来参与运算？
				有，宽高不确定，两个整数  int.
*/

public static void draw(int row,int col)
{
	for (int x=1;x<=row ;x++ )
	{
		for (int y=1;y<=col ;y++ )
		{
			System.out.print("*");
		}
	System.out.println();
	}
	return;//可省略
}
/*
需求3：定义一个功能，比较两个数是否相等。
明确一： 这个功能的结果是什么？
					是否相等。有，boolean。
明确二：这个功能实现过程中是否需要未知参数来参与运算？
                    有，两个数。
*/
public static boolean equals(int a,int b)
	{/*
			if(a==b)
				return true;
			else
				return false;



				*/
			//	return (a==b)?true;false; 

			return a==b;

}


/*
需求4：定义一个功能，获取两个整数中较大的那个。
明确一： 这个功能的结果是什么？
					有，其中的一个数。int
明确二：这个功能实现过程中是否需要未知参数来参与运算？
					需要，两个整数。int
*/

public static int getMax(int a,int b)
	{
		/*if(a>b)
			return a;
		else
			return b;
*/
		return a>b?a:b;
}
	/*
	定义功能，打印99乘法表

	*/

	public static void print99()
		{
		for (int x=1;x<=9 ;x++ )
		{
			for (int y=1;y<=x ;y++ )
			{
					System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}

	/*
	根据考试情况获取学生分数对应的等级
	90-100			A
	80-89				B
	70-79				C
	60-69				D
	60以下			F
	*/
	public static char getLevel(int point)
	{
		if(point>=90&&point<=100)
			return 'A';
		if(point>=80&&point<=89)
			return 'B';
		if(point>=70&&point<=79)
			return 'C';
		if(point>=60&&point<=69)
			return 'D';
		else
			return 'F';
	}
}