
public class Main {

	public static void main(String[] args) {
		int sayi1=14;
		int sayi2=25;
		int sayi3=195;
		
		int enBuyuk=0;
		
		if (sayi1>sayi2) {
			enBuyuk=sayi1;
		} else if(sayi2>sayi3){
			enBuyuk=sayi2;
		}else {
			enBuyuk=sayi3;
		}
		System.out.println("En buyuk sayi :"+enBuyuk);
		
		
}
}