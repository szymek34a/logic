package logic_java;

public class Main {

	public static void main(String[] args) {
		
		Punkty punkty = new Punkty();
		punkty.ustawX(10);
		punkty.ustawY(20);
		System.out.println("Wsp�rz�dne punktu to (" + punkty.dajX() + ", " + punkty.dajY() + ")");
	}
	
	void metoda1() {
		System.out.println("Ta metoda nic nie zwraca ale wy�wietla ten tekst");
	}
	
	int metoda2() {
		return 2;
	}
	
	String metoda3() {
		return "Jaki� napis";
	}
	
}
