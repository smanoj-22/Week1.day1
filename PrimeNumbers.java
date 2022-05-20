package week1.day1;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int input = 13;
		boolean flag = false;
		 for (int i= 2; i< input; i++)
		 {
			 if(input % i == 0)
			 {
				 System.out.println("Not a Prime");
				 flag = true;
				 break;
			 }
			 
		 }
		 if(flag == false)
		 {
			 System.out.println("It's a Prime");
		 }
	}

}
