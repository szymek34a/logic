package logic_java;

public class Main {

	public static void main(String[] args) {
		
		Punkt punkt1 = new Punkt(10, 20);
 		System.out.println("Wsp�rz�dne 1 to: ");
 		System.out.println("x1: "+punkt1.x);
 		System.out.println("y2: "+punkt1.y);
 
 		Punkt punkt2 = new Punkt(punkt1);
 		System.out.println("Wsp�rz�dne 2 to: ");
 		System.out.println("x2: "+punkt2.x);
 		System.out.println("y2: "+punkt2.y);

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
