package logic_java;

public class Main {

	public static void main(String[] args) {
		
		Punkty punkty = new Punkty(10,20);
		
		Test.zmien(punkty);
		
		System.out.println("Wspó³rzêdne punktu to (" + punkty.dajX() + ", " + punkty.dajY() + ")");
		
		int a = 5;
		Test.zwieksz(a);
		System.out.println(a);
		
		System.out.println("Wspó³rzêdne to:");
		System.out.println("x: " + punkty.wspX);
		System.out.println("y: " + punkty.wspY);
	}

	void metoda1() {
		System.out.println("Ta metoda nic nie zwraca ale wyœwietla ten tekst");
	}

	int metoda2() {
		return 2;
	}

	String metoda3() {
		return "Jakiœ napis";
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
