package day013;

public class Program02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x=new int[5];//04index
		x[0]=100;
		x[4]=300;
		x[2]=400;
		System.out.println(x[0]);//100
		System.out.println(x[1]);//0
		System.out.println("index loop");
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("For-Each loop");
		for(int a:x)//100,0400,0,300)
		{
			System.out.println(a);
	}
	String[]name={"abc","bcd","ced","def"};
	System.out.println(name.length);
	System.out.println(name[0]);//abc
	
	
	
	name[0]="ABC";
	System.out.println(name[0]);
	
				{
			
		}
	
		

	}

}
