package logic_java;

public class Firma {

	public static void main(String[] args) {

		Pracownik prac = new Pracownik("Wlodek", "Ziêba", 3000);
		System.out.println("Imiê: " + prac.imie);
		System.out.println("Nazwisko: " + prac.nazwisko);
		System.out.println("Wyp³ata: " + prac.wyplata + "\n");

		Szef szef = new Szef();

		System.out.println("Imiê: " + szef.imie);
		System.out.println("Nazwisko: " + szef.nazwisko);
		System.out.println("Wyp³ata: " + szef.wyplata);
		System.out.println("Premia: " + szef.premia + "\n");

		szef.imie = "Tadeusz";
		szef.nazwisko = "Kowalski";
		szef.wyplata = 10000;
		szef.premia = 2000;
		System.out.println("Imiê: " + szef.imie);
		System.out.println("Nazwisko: " + szef.nazwisko);
		System.out.println("Wyp³ata: " + szef.wyplata);
		System.out.println("Premia: " + szef.premia);

	}

}
