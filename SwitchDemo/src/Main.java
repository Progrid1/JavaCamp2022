
public class Main {

	public static void main(String[] args) {
		char not='F';
		
		switch (not) {
		case 'A':
			System.out.println("Mukemmel.");
			break;
		case 'B':
		case 'C':
			System.out.println("Iyi.");
			break;
		case 'D':
			System.out.println("Orta.");
			break;
		case 'F':
			System.out.println("Kotu.");
			break;
		default:
			System.out.println("Gecersiz.");
			break;
		}
		
		
		
	}

}
