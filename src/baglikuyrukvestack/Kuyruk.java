package baglikuyrukvestack;

public class Kuyruk {
	elemanlar son;
	elemanlar bas;
	
	int boyut;
	public Kuyruk() {
		bas=null;
		son=null;
		boyut=0;
	}
	void sonaEkle(elemanlar yeni) {
			if (bas==null) {
				bas=yeni;
				son=yeni;
				return;
			}
			son.sonraki=yeni;
			son=yeni;
			boyut++;
		}
	void bastanSil() {
		if (bas==null) {
			System.out.println("liste boş silinecek eleman yok");
			return;
		}
		bas=bas.sonraki;
		boyut--;
	}
	void listeyazdir() {
		elemanlar temp=bas;
		while(temp!=null) {
			System.out.println(temp.isim+" "+temp.soyisim+" "+temp.telno+" "+temp.dt);
		
			temp=temp.sonraki;
			
		}
		System.out.println("****************");
	}
}


