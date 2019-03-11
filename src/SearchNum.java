package basic_assignments;

import java.util.Scanner;

public class SearchNum {

	public static void main(String[] args) {
		int numbers[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		int num;
		System.out.println("enter a number you want to search");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == num) {
				System.out.println("number found at position number  "+i);
				break;
			}

		}

	}

}
