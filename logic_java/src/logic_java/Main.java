package logic_java;

public class Main {

	public static void main(String[] args) {
		
		Punkty punkty = new Punkty();
		punkty.ustawX(10);
		punkty.ustawY(20);
		System.out.println("Wsp�rz�dne punktu to (" + punkty.dajX() + ", " + punkty.dajY() + ")");
	}
	
}
