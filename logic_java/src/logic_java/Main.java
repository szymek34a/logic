package logic_java;

public class Main {

	public static void main(String[] args) {
		
		Punkt punkt = new Punkt();
		punkt.ustawX(10);
 		punkt.ustawY(20);
 		System.out.println("Wsp�rz�dne to: ("+ punkt.dajX() + ", "+ punkt.dajY() +")");
 		
 		int a = 5;
 	    Test.zwieksz(a);
 	    System.out.println(a);
		
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
	
	String metodaNapis(String str) {
		System.out.println(str);
		return str;
	}

	int sumaLiczb(int a, int b, int c) {
		return a + b + c;
	}

	double sumaLiczb2(int a, short b, double c) {
		return a + b + c;
	}

}
