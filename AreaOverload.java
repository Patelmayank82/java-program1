import java.util.*;

class AreaOverload{
	
	final double pi=3.14;
	
		int r;
		int l,b;
		
		double area(int r)
		{
			return(pi*r*r);
		}
		int area(int l,int b)
		{
			return(l*b);
		}
		
	
	public static void main(String args [])
	{
		AreaOverload obj=new AreaOverload();
		
		
		System.out.println("Circle area:"+obj.area(5));
		System.out.println("Circle area:"+obj.area(2,3));
		
	}
}