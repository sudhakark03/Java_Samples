import java.io.*;
import java.util.*;
class Array2
{
	public static void main (String args[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Eneter the range");
		int n = ob.nextInt();
		int array[]=new int[n];
		System.out.println("ente
		r the values");
		for(int i=0;i<n;i++)
		{
			array[i] = ob.nextInt();
		}
		for(int i:array)
		{
		System.out.println(i);
		}
	}
}