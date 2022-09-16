
public class Main {

	public static void main(String[] args) {
		int[] sayilar= {1,2,5,7,9,0};
		
		int aranacak=1;
		boolean varMi=false;
		
		for (int i : sayilar) {
			if (aranacak==i) {
				varMi=true;
			}
		}
		if (varMi) {
			System.out.println("Sayi mevcuttur.");
		} else {
			System.out.println("Sayi mevcut degildir.");
		}
		
		
		
	}

}
