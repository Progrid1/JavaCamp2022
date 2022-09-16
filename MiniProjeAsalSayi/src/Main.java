
public class Main {

	public static void main(String[] args) {
	//1 ve kendisi dışında böleni olmayan
		
		int number=23;
		boolean asalMi=true;
		
		for (int i = 2; i < number; i++) {
			if (number%i==0) {
				asalMi=false;
			}
			
		}
		if (asalMi) {
			System.out.println("Sayi asaldir.");
		}else {
			System.out.println("Sayi asal degildir.");
		}
		
		
		
		
		
		
	}

}
