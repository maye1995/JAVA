class  ForFor99
{
	public static void main(String[] args) 
	{

		/*
		99�˷���
		1*1=1
		1*2=2 2*2=4
		1*3=3  2*3=6  3*3=9
		*/

		for (int x=1;x<=9 ;x++ )
		{
			for (int y=1;y<=x ;y++ )
			{
					System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}

		System.out.println("Hello World!");
	}
}
