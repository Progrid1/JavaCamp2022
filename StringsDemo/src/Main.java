
public class Main {

	public static void main(String[] args) {
		String mesaj = "   Bugun hava cok guzel.   ";

//		System.out.println(mesaj);
//		System.out.println("Eleman sayisi :" + mesaj.length());
//		System.out.println(mesaj.charAt(4));
//		System.out.println(mesaj.concat(" Yasasin!"));
//		System.out.println(mesaj.startsWith("B"));
//		System.out.println(mesaj.endsWith("."));
//		char[] karakterler=new char[5];
//		mesaj.getChars(0, 5, karakterler, 0);
//		System.out.println(karakterler);
//		System.out.println(mesaj.indexOf("av"));
//		System.out.println(mesaj.lastIndexOf("u"));
		
		System.out.println(mesaj.replace(" ", "_"));
		String yeniMesaj=mesaj.replace(" ", "_");
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,4));
		
		//for (String kelime : mesaj.split(" ")) {
		//	System.out.println(kelime);
		//}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
