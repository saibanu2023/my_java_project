package day03;

public class Javaprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javaprogram xyz=new Javaprogram();
		addMethod(20,30);
		xyz.subMethod(10,5);
		xyz.mulMethod(10,10);
		
		addMethod(120,230);
		xyz.subMethod(110,15);
		xyz.mulMethod(10,6);
	}
	public static void addMethod(int a,int b)
	{
		System.out.println(a+b);
		
	}
	public void subMethod(int a,int b)
	{
		System.out.println(a-b);
		
	}
	public void mulMethod(int a,int b)
	{
		System.out.println(a*b);
	}
}
	
	
	
		
		
		
		
		
		
		
	


