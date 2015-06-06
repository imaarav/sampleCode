/*arraylist capacity-size indexoutofbounderror not solved yet omkar d*/

import java.util.*;
import java.io.*;

public class MissingNumbers
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int[] a1, a2;
		int n1, n2;
		int min,max;
		ArrayList <Boolean> al;
		
		n1 = in.nextInt();
		a1 = new int[n1];
		for (int i=0; i<n1; i++)
		{
			a1[i] = in.nextInt();
		}
		
		min = a1[n1-1];
		max = a1[n1-1];
		n2 = in.nextInt();
		a2 = new int[n2];
		for (int i=0; i<n2; i++)
		{
			a2[i] = in.nextInt();
			if (a2[i]<min) min = a2[i];
			if (max<a2[i]) max = a2[i];
		}
		
		al = new ArrayList<Boolean>(max+1);
		
		for (int i=0; i<a2.length; i++)
		{
			al.add(a2[i], true);
		}
		
		for(int i=0; i<a1.length; i++)
		{
			al.add(a1[i], false);
		}
		
		for(int i=min; i<al.size(); i++)
		{
			if (al.get(i) == true) System.out.println(i);
		}
		
	}
}