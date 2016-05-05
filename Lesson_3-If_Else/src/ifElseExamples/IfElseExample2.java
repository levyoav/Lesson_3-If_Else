package ifElseExamples;

public class IfElseExample2 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 5) + 48;
		System.out.println(r);

		if (r > 50) {
			System.out.println("Big");
		} else if (r < 50) {
			System.out.println("Small");
		} else {
			System.out.println("Bingo");
		}
	}

}
