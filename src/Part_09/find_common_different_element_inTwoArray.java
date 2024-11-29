package Part_09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class find_common_different_element_inTwoArray
{
 public static void main(String[] args) 
 {
	
	 int []a= {1,8,4,7,6,9};
	 int []b= {5,7,6,2,8};                  //find common and different element in two array
	System.out.println(commonelement(a,b));
	System.out.println(different(a,b));
	 
}
 static Set<Integer> commonelement(int a[],int b[])
 {
	 Set<Integer> s=new HashSet();
	 Set<Integer> s1=new HashSet();
	 
	 for(int i:a)
	 {
		 s.add(i);
	 }
	 for(int i:b)
	 {
		 s1.add(i);
	 }
	 s.retainAll(s1);
	 
	 return s;
 }
 public static List<Integer> different(int []a,int[]b)
 {
	 List <Integer>al=new ArrayList<>();
	 boolean found=false;
	 for(int i=0;i<a.length-1;i++)
	 {
		 int j;
		 for(j=0;j<b.length-1;j++)
		 {
			 if(a[i]==b[j])
			 {	 
			 found=true;
			 break;
		 }
	 }
	 if(!found)
	 {
		 al.add(b[j]);
	 }
 }
return al;
}
}
