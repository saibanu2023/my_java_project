
public class Package001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 90;
		int b = 10;
		int c = 100;
		int d = 60;
		if (a >= b && a >= c && c >= d) {
			if (a == b && a == c && c == d) {
				System.out.println("a,b,c, & d are equal");
			} else if (a == b && b == d && a > d) {
				System.out.println("a & b & c are equal and greater than d");
			} else if (a == d && a > d)
		
			{
				System.out.println("a & d are equal and greater thanb");
			}
			if (b > d) {
				System.out.println("a is greater than b and b is greater than c and c is greater than d");
			}
			{
				System.out.println("a is greater than b,d b&c are equal");

			}
		}

	}

}
