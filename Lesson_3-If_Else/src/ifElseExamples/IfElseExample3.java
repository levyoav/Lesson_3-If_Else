package ifElseExamples;

public class IfElseExample3 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 101);
		System.out.print(r + " is ");

		if (r < 50) {
			System.out.print("Small");
		} else {
			System.out.print("Big");
		}

		System.out.print(" and ");

		if (r % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

}
