package ifElseExamples;

public class IfElseExample {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 21);
		int b = (int) (Math.random() * 21);
		
		System.out.println(a);
		System.out.println(b);

		if (a > 10) {
			System.out.println("Big");
		} else {
			System.out.println("Small");
		}

	}
}
