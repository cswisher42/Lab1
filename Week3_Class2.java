import java.util.*;

public class Week3_Class2
{
	public static void main(String [] args)
	{
		/*int[] days = {31, 28,31,30,31,30,31,31,30,31,30,31};
		
		
		int index = 1;
		for(int month : days)
		{
			System.out.println("Month " + index + " has " + month + " days.");
			index++;
		}
		
		for(index = 0; index < days.length; index++)
		{
			System.out.println("Month " + (index+1) + " has " + days[index] + " days.");
		}*/
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter String 1: ");
		String s1 = s.nextLine();
		System.out.print("Enter String 2: ");
		String s2 = s.nextLine();
		
//		if(s1 == s2)
		if(s1.equalsIgnoreCase(s2))
			System.out.println("Strings are equal.");
		else
			System.out.println("Strings are NOT equal.");
	}
}