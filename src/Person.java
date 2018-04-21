
public class Person {
	public String Handy_Nummer;
	public String Nachname;
	enum Funktionen {
		Einheitsfuehrer,
		Unterfuehrer,
		Fachhelfer
	};
	
	enum Einheit_Art {
		TZ,
		OV_Stab
	};
	
	int[] Zusatzqualifikation = new int[4];
	
	public Person(String Handy_Nummer, String Nachname, int Funktionen,int[] Zusatzqualifikation) {
		this.Handy_Nummer=Handy_Nummer;
		this.Nachname=Nachname;
		
		
	}
	

}