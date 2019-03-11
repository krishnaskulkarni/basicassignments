package basic_assignments;

import java.util.Scanner;

public class Validation {

	public static void main(String[] args) {
		boolean a=true;
		String userName;
		String passWord;
		String originalUserName = "krishna";
		String originalPassWord = "krishna@14321";
		int count = 0;
		while (a) {
			System.out.println("enter your details here");
			System.out.println("USERNAME");
			Scanner sc = new Scanner(System.in);
			userName = sc.nextLine();
			System.out.println("PASSWORD");
			passWord = sc.nextLine();
			
			if ((userName == originalUserName && passWord == originalPassWord)==false) {
				System.out.println("WELCOME");
				a=false;
			}
			if (userName != originalUserName && passWord != originalPassWord) {
				count++;
				if (count == 3) {
					System.out.println("contact Admin");
					break;
				}
			}

		}
	}
}