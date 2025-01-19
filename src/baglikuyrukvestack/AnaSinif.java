package baglikuyrukvestack;

public class AnaSinif {
	public static void main(String[] args) {
		elemanlar ad1=new elemanlar("ege","negir",123,2004);
		elemanlar ad2=new elemanlar("serhat","kocaağa",345,2003);
		elemanlar ad3=new elemanlar("halil","hacı",567,2005);
		elemanlar ad4=new elemanlar("yusuf","altuğ",789,2008);
		elemanlar ad5=new elemanlar("utku","karaca",258,2001);
		Kuyruk ky=new Kuyruk();
		ky.sonaEkle(ad1);
		ky.sonaEkle(ad2);
		
		ky.listeyazdir();
		ky.sonaEkle(ad3);
		ky.sonaEkle(ad4);
		ky.sonaEkle(ad5);
		ky.listeyazdir();
		ky.bastanSil();
		ky.listeyazdir();
		
		
	}

}
