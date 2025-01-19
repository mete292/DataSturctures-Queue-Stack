package baglilistestack;

public class Stack {
	Eleman1 bas;
	Eleman1 son;
	int boyut;
	Stack(){
		bas=null;
		son=null;
		
		}
	 void sonaEkle(Eleman1 yeni) {
		if (bas==null) {
			bas=yeni;
			son=yeni;
			return;
	}
		son.sonraki=yeni;
		son=yeni;
		
}
	void listeyazdir() {
		Eleman1 temp=bas;
		while(temp!=null) {
			System.out.println(temp.isim+" "+temp.soyisim+" " +temp.telno+" "+temp.dt);
			temp=temp.sonraki;
			}
		System.out.println("*******************************");
		}
 void sondanSil() {
	 if (bas==null) {
		 System.out.println("liste boş");
		 return;	
}
	 if (bas==son) {
		 System.out.println("listede 1 eleman vardi ve silindi");
		 bas=son=null;
		 return;
}
	 Eleman1 temp=bas;
	 while(temp.sonraki.sonraki!=null) {
		 temp=temp.sonraki;
	 }
	 son=temp;
	 temp.sonraki=null;
	 }
	
	public static void main(String[] args) {
	
	}
	
}
