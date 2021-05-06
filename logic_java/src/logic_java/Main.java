package logic_java;

public class Main {

	public static void main(String[] args) {
		
		Punkt punkt = new Punkt();
		punkt.x = 3;
		punkt.y = 5;

		Test.zmien(punkt);

		System.out.println("Wspó³rzêdne to: " + punkt.x + " " + punkt.y);
 	    
	}
	
	void metoda1() {
		System.out.println("Ta metoda nic nie zwraca, ale wyœwietla ten tekst");
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
