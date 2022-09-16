
public class Main {

	public static void main(String[] args) {
		double[] myList = { 1.2, 1.3, 4.3, 6.3 };
		double total = 0;
		double max = myList[0];
		for (double d : myList) {
			if (max < d) {
				max = d;
			}
			total = d + total;
			System.out.println(d);
		}

		System.out.println("Total :"+total);
		System.out.println("Greater :"+max);

	}

}
