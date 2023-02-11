package day06;

import java.util.Scanner;

public class program01 {

	public static void main(String[] args) {
		//+ - */(Q)%(R)Numbers
		Scanner x=new Scanner(System.in);
		System.out.println("Enter int Value of a:-10");
		
		int a=x.nextInt();
		System.out.println("Enter int value of b:-10");
		int b=x.nextInt();
		System.out.println("Enter Double Value of c:-10");
		double c=x.nextDouble();
		x.close();
		//int () int--->int
		//int ()double/float--->double/float
		System.out.println(a+b);
		System.out.println(a+c);
		
		System.out.println(a-b);
		System.out.println(a-c);
		
		System.out.println(a/b);
		System.out.println(a/c);
		// TODO Auto-generated m;
		System.out.println(a%b);
		System.out.println(a%c);
	}
	

	}


