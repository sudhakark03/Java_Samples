import java.util.*;
class CollSorting
{
	public static void main(String args[])
	{
		List<Integer> li=new ArrayList<Integer>();
		li.add(84);
		li.add(45);
		li.add(63);
		Collections.sort(li);
		for(int n:li)
			System.out.println(n);
	}
}