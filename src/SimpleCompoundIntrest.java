package basic_assignments;

import java.util.Scanner;

public class SimpleCompoundIntrest {

	public static void main(String[] args) {
		int principal;
		int time;
		float interestRate;
		float si;
		float ci;
		
		System.out.println("enter the principal");
		Scanner object = new Scanner(System.in);
		principal = object.nextInt();
		
		System.out.println("enter the time/period in years");
		time = object.nextInt();
		
		System.out.println("enter the interest rate");
		interestRate = object.nextFloat();
		
		si = principal*time*interestRate/100;
		System.out.println("Simple interest is "+si);
		
		ci=(float)(principal * Math.pow((1+interestRate/100), time)-principal);
		System.out.println("compound interest is"+ci);
		
		

	}

}
