package basic_assignments;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		int number;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		int sum = 0;
		int count=0;
		int digit;
		int originalNum = number;
		int result = 1;
		
		while(originalNum !=0) {
			originalNum = originalNum/10;
			count++;
		}
		originalNum = number;
		while(originalNum != 0) {
			digit = originalNum %10;
			originalNum=originalNum/10;
		
				for(int i=0;i<count;i++) {
						result = result*digit;
				}
				
			sum=sum+result;
			result = 1;
		}
		if(sum == number) {
			System.out.println("number is amstrong");
		}
		else
			System.out.println("number is not amstrong");
	}

}
