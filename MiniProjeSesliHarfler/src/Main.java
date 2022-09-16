
public class Main {

	public static void main(String[] args) {
		char harf = 'Ü';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Harf kalin seslidir.");
			break;

		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("Harf ince seslidir.");
			break;

		default:
			System.out.println("Gecersiz harf.");
			break;
		}

	}

}
