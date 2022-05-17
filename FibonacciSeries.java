package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int b= 1;
		int c;
		System.out.println(a);
		System.out.println(b);

		for (int i=0; i< 6;i++) {
			System.out.println("iteration "+i);
			c = a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
		
	}

}
