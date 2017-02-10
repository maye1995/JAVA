class  day04
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	

/*

*****
****
***
**
*

*//*int z =5;
	for (int x =1;x<=5 ;x++ )
	{
		for (int y =1;y<=z ;y++ )//1-5 1-4 1-3 1-2 //1-5 2-5 3-5
		{
			System.out.print("*");
		}
		System.out.println("*");
		z --;
	}
	*/
	
	for (int x =1;x<=5 ;x++ )
	{
		for (int y =x;y<5 ;y++ )//1-5 1-4 1-3 1-2 //1-5 2-5 3-5
		{
			System.out.print("*");
		}
		System.out.println("*");
		
	}

	/*
	*
	**
	***
	****
	*****
	*/
	System.out.println("------------------");
	for (int x=1;x<=5 ;x++ )
	{
		for (int y =1;y<=x ;y++ )
		{
			System.out.print("*");
		}
		System.out.println("*");
	}

	System.out.println("------------------");

	/*
	54321
	5432
	543
	54
	5
	*/
    int z =1;
	for (int x =1;x<=5 ;x++ )
	{
		for (int y=5;y>z ;y-- )
		{
			System.out.print(y);
		}
		System.out.println();
		z++;
	}

	System.out.println("------------------");

	/*
	1
	22
	333
	4444
	55555
	*/
	for (int x=1;x<=5 ;x++ )
	{
		for (int y=1;y <=x; y++)
		{
			System.out.print(x);
		}
		System.out.println();
	}
}
}