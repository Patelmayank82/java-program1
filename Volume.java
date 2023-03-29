class Volume{
	
	int ans;
	
	Volume(int l)
	{
		ans=l*l*l;
		
		System.out.println("Volume of Squre is: "+ans);
	}
	Volume(int l,int w,int h)
	{
		ans=l*w*h;
		
		System.out.println("Volume of Rectangle is: "+ans);
	}
	
	public static void main(String args [])
	{
		Volume obj=new Volume(5);
		Volume obj1=new Volume(5,2,7);

	}
}