import java.util.*;

class Stream{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		String s1;
		String s2="";
		int l,i;
		
		s1=sc.nextLine();
		
		System.out.println("Str is=="+s1);
		
		l=s1.length();
		
		for(i=0;i<l;i++)
		{
			s2=s1.charAt(i)+s2;
		}
		
		System.out.println("Reversed Str is=="+s2);
		
		if(s1.equals(s2))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}