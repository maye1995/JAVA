/*
需求：函数得重载
*/

class FunctionDemo4 
{
	public static void main(String[] args) 
	{	
		add(4,4);
		add(2.4,3.4);
		add(1,3,6);
		//System.out.println("Hello World!");
		printCFB();
	}

	/*
	函数的重载
	1.同一个类
	2 同名
	3 参数个数  或者参数类型不同。
	4 函数重载和返回值类型无关。
	5如果函数出现调用得不确定性，编译会失败。
	*/

	
	//加法运算。两个整数得和
	public static int add(int a,int b){
		return a+b;
	}

	//加法运算。两个小数得和
	public static double add(double a,double b){
		return a+b;
	}

	//加法运算。三个整数得和
	public static int add(int a,int b,int c){
		return add(a,b)+c;
	}

	/*
	打印乘法表
	*/
	public static void printCFB(int num){
		for (int x = 1;x<=num ;x++ )
		{
			for (int y =1;y<=x ;y++ )
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
	/*
	打印标准乘法表
	*/
	public static void printCFB(){
		printCFB(9);
		}
	}
}
