package Part_09;

public class Star_Pattern 
{
	public static void main(String[] args) 
	{
		
	int star=1;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=star;j++)
		{
			System.out.print("*");
		}
		star++;
		System.out.println();
	}
	int star1=5;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=star1;j++)
		{
			System.out.print("*");
		}
		star1--;
		System.out.println();
	}
	System.out.println();
	System.out.println("----------------piramid-----------------");
	int space=4;
	int star2=1;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=star2;k++)
		{
			System.out.print("*");
		}
		System.out.println();
		space--;
		star2=star2+2;
	}
		System.out.println();
		System.out.println("-------------diamand pattern--------------------");
		int space4=4;
		int star4=1;
		for(int m=1;m<=9;m++)
		{
			for(int n=1;n<=space4;n++)
			{
				System.out.print(" ");
			}
			for(int t=1;t<=star4;t++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(m<5)
			{
				space4--;
				star4=star4+2;
			}
			else
			{
				star4=star4-2;
				space4++;
			}
		}
		System.out.println();
		System.out.println("------------special character---------------------");
		String sen="JAva_is_Programming_guide_@123";
		int upper=0,lower=0,spl=0,num=0;
		for(int s=0;s<sen.length();s++)
		{
			char ch=sen.charAt(s);
		
			if(ch>= 'A'&&ch<='Z')
				upper++;
			else if(ch>= 'a'&&ch<='z')
				lower++;
			else if(ch>= '0'&&ch<='9')
					num++;
			else
				spl++;
		}
		System.out.println("upper "+upper);
		System.out.println("lower "+lower);
		System.out.println("num "+num);
		System.out.println("special "+spl);
		System.out.println();
		System.out.println("--------------number pattern------------------");
		int num1=1;
		for(int d=1;d<=5;d++)
		{
			for(int e=1;e<=num1;e++)
			{
			System.out.print(num1+" ");
			num1++;
			}
		}
		System.out.println();
		
		}
		
	}

