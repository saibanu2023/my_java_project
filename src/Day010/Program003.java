package Day010;

public class Program003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int table=6;
		System.out.println("-----While Program----");
		int a=1;
		while(a<=10)
		{
			System.out.println(table+"x"+"="+table*a);
			a=a+1;
		}
		System.out.println("Do-While Program----");
		int b=1;
		do {
			System.out.println(table+"x"+"="+table*b);
			b=b+1;
		}
		while(b<=10);
		System.out.println("-----For Program----");
		for(int c=1;c<=10;c=c+1)
		{
			System.out.println(table+"x"+c+"="+table*c);
		}
	}


			
		
	}


