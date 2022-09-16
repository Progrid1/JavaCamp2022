
public class Main {

	public static void main(String[] args) {
		//220-284
		int sayi1=284;
		int sayi2=220;
		int toplam=0;
		for (int i = 1; i < sayi1; i++) {
			if (sayi1%i==0) {
				toplam=toplam+i;
			}
		}
		
		if (sayi2==toplam) {
			System.out.println("Arkadas sayidir.");
		}else {
			System.out.println("Arkadas sayi degildir.");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
