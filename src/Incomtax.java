package basic_assignments;
import java.util.Scanner;

public class Incomtax {

	public static void main(String[] args) {
		int ctc;
		int tax;
		System.out.println("enter your CTC");
		Scanner sc = new Scanner(System.in);
		ctc=sc.nextInt();
		if(ctc > 0 && ctc <= 180000) {
			System.out.println("you don't have to pay taxes");
		}
		if(ctc > 180000 && ctc <= 300000) {
			tax = (int)(0.10 * ctc);
			System.out.println("you have to pay"+tax+"as income tax");
		}
		if(ctc > 300000 && ctc <= 500000) {
			tax = (int)(0.20 * ctc);
			System.out.println("you have to pay"+tax+"as income tax");
		}
		if(ctc > 500000 && ctc <= 1000000) {
			tax = (int)(0.30 * ctc);
			System.out.println("you have to pay"+tax+"as income tax");	
		}
		

	}

}
