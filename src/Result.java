package basic_assignments;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		int subject1=0;
		int subject2=0;
		int subject3=0;
		int count=0;
		System.out.println("enter the marks of first subject");
		Scanner sc = new Scanner(System.in);
		subject1 = sc.nextInt();
		System.out.println("enter the marks of second subject");
		subject2 = sc.nextInt();
		System.out.println("enter the marks of third subject");
		subject3 = sc.nextInt();
		int marks[]= {subject1,subject2,subject3};
		
		for(int i=0;i<3;i++) {
			if (marks[i]>60) {
				count++;
			}
		}
		
		if(count==3) {
			System.out.println("student got passed");
		}
		
		if(count==2) {
			System.out.println("student got promoted");
		}
		else 
			System.out.println("student failed");
	}

}
