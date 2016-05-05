package ifElseExamples;

public class LeapYear {

	public static void main(String[] args) {

		int year = (int) (Math.random() * 10001) - 5000;
		System.out.print("Year is: " + year);

		// year = Math.abs(year); // not needed

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(" is leap");
		} else {
			System.out.println(" is not leap");
		}
	}

}
