
public class Main {

	public static void main(String[] args) {
		//6 = 1,2,3
		//28= 1,2,4,7,14
		
		int number=5;
		int total=0;
		
		
		for (int i = 1; i < number; i++) {
			if (number%i==0) {
				total= i+total;
			}
			
		}
		
		if (number==total) {
			System.out.println("Mukemmel sayidir.");
		}else {
			System.out.println("Mukemmel sayi degildir.");
		}
		
		
	}

}
