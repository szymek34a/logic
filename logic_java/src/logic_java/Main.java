package logic_java;

public class Main {

	public static void main(String[] args) {
		
		Punkty punkty = new Punkty();
		punkty.ustawX(10);
		punkty.ustawY(20);
		System.out.println("Wspó³rzêdne punktu to (" + punkty.dajX() + ", " + punkty.dajY() + ")");
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
	
}
