package logic_java;

public class Firma {

	public static void main(String[] args) {

		Pracownik prac = new Pracownik("Wlodek", "Zi�ba", 3000);
		System.out.println("Imi�: " + prac.imie);
		System.out.println("Nazwisko: " + prac.nazwisko);
		System.out.println("Wyp�ata: " + prac.wyplata + "\n");

		Szef szef = new Szef();

		System.out.println("Imi�: " + szef.imie);
		System.out.println("Nazwisko: " + szef.nazwisko);
		System.out.println("Wyp�ata: " + szef.wyplata);
		System.out.println("Premia: " + szef.premia + "\n");

		szef.imie = "Tadeusz";
		szef.nazwisko = "Kowalski";
		szef.wyplata = 10000;
		szef.premia = 2000;
		System.out.println("Imi�: " + szef.imie);
		System.out.println("Nazwisko: " + szef.nazwisko);
		System.out.println("Wyp�ata: " + szef.wyplata);
		System.out.println("Premia: " + szef.premia);

	}

}
