package basic_assignments;

public class FindAmstrong {

	public static void main(String[] args) {
		int number;
		for (number = 100; number <= 999; number++) {
			int sum = 0;
			int count = 0;
			int digit;
			int originalNum = number;
			int result = 1;

			while (originalNum != 0) {
				originalNum = originalNum / 10;
				count++;
			}
			originalNum = number;
			while (originalNum != 0) {
				digit = originalNum % 10;
				originalNum = originalNum / 10;

				for (int i = 0; i < count; i++) {
					result = result * digit;
				}

				sum = sum + result;
				result = 1;
			}
			if (sum == number) {
				System.out.println("amstrong" + number);
			}
		}

	}

}
