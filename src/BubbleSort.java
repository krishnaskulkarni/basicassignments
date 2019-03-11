package basic_assignments;

public class BubbleSort {

	public static void main(String[] args) {
		int numbers[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		
		for(int i =0; i<numbers.length; i++) {
			
			for(int j =0;j<numbers.length-i-1;j++) {
				if(numbers[j] > numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		for(int k =0; k < numbers.length; k++) {
			System.out.print(numbers[k]+",");
		}
	}

}
