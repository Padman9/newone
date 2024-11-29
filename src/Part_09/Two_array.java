package Part_09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Two_array extends word_occurance
{
	
	public static Set<Integer> commonelement(int[]a,int []b)
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
	public static List<Integer> differelemnt(int[]a,int[]b)
	{
		List<Integer> different = new ArrayList<>();
        for (int i = 0; i < a.length-1; i++) {
            boolean found = false;
            int j;
            for (j = 0; j < b.length-1; j++) {
                if (a[i] == b[j]) 
                {
                    found = true;
                     break; 
                }
            }
            if (!found) 
            {
                different.add(b[j]);
                    
            }
        }
        return different;
	}
  public static void main(String[] args) 
  {
	int a[]= {1,5,7,8,0,9};
	int b[]= {1,5,2,9,0,3,6};
	
	System.out.println("common elements ->"+commonelement(a, b));
	
	System.out.println("different element "+differelemnt(a,b));
	
}
}
