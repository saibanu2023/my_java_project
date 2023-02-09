package day04.test01;

public class Javaprogram {

	public static void addMethod(int a,int b)
	{
		System.out.println(a+b);
	}
	private static void subMethod(int a,int b)
	{
		System.out.println(a-b);
	}
	protected static void mulMethod(int a,int b)
	{
		System.out.println(a*b);
	}
	static void sqrtMethod(int a)
	{
		System.out.println(a*a);
	}
	public void addMethodNonStatic(int a,int b)
	{
		System.out.println(a+b);
	}
	private void subMethodNonStatic(int a,int b) 
		{
		System.out.println(a-b);
		}
	protected void mulMethodNonStatic(int a,int b)
	{
		System.out.println(a*b);
	}
	void sqrtMethodNonStatic(int a)
	{
		
	}
	public static void main(String[] args) {
		addMethod(10,10);
		subMethod(20,10);
		mulMethod(3,2);
		sqrtMethod(10);
		Javaprogram x=new Javaprogram();
		x.addMethodNonStatic(100,10);
		x.subMethodNonStatic(20,5);
		x.mulMethodNonStatic(30,20);
		x.sqrtMethodNonStatic(4);
	}
	
	}
	

		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
