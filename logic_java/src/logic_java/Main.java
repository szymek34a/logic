package logic_java;

public class Main {

	public static void main(String[] args) {
		
		Punkt punkt = new Punkt();
		punkt.ustawX(10);
 		punkt.ustawY(20);
 		System.out.println("Wsp�rz�dne to: ("+ punkt.dajX() + ", "+ punkt.dajY() +")");
		
	}
	
	void metoda1() {
		System.out.println("Ta metoda nic nie zwraca, ale wy�wietla ten tekst");
	}

	int metoda2() {
		return 2;
	}

	String metoda3() {
		return "Jakis napis";
	}

}
