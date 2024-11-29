package Part_09;
import java.util.Arrays;
import java.util.Scanner;

public class missingNumberinarray
{
  public static void main(String[] args) 
  {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the number: ");
   int size =sc.nextInt();
   int[] ar=new int[size];
   for(int i=0;i<size;i++)
   {
	   System.out.println("Enter the number: ");
	   ar[i]= sc.nextInt();   
   }
   if(size %2==0)
   {
   for(int i=0;i<ar.length;i=i+2)
   {
	   System.out.println(ar[i]+" ");
   }
   }
   else
   {
   for(int i=1;i<ar.length;i=i+2)
   {
	   System.out.println(ar[i]+" ");
   }
   
   }

  
		
		
	  
}
  }

