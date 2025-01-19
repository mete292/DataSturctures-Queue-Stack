package baglilistestack;

public class AnaSinif1 {

	public static void main(String[] args) {
		Eleman1 kisi1=new Eleman1("ege","negir",123,2004);
		Eleman1 kisi2=new Eleman1("serhat","kocaağa",345,2003);
		Eleman1 kisi3=new Eleman1("halil","hacı",567,2005);
		Eleman1 kisi4=new Eleman1("yusuf","altuğ",789,2008);
		Eleman1 kisi5=new Eleman1("utku","karaca",258,2001);
		Stack st=new Stack();
		st.sonaEkle(kisi1);
		st.sonaEkle(kisi2);
		st.listeyazdir();
		st.sonaEkle(kisi3);
		st.sonaEkle(kisi4);
		st.sonaEkle(kisi5);
		st.listeyazdir();
		st.sondanSil();
		st.listeyazdir();
		st.sondanSil();
		st.listeyazdir();
		

	}

}
