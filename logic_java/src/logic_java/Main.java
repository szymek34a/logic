package logic_java;

public class Main {

	public static void main(String[] args) {
		
		Punkt punkt = new Punkt();
		punkt.ustawX(10);
 		punkt.ustawY(20);
 		System.out.println("Wspó³rzêdne to: ("+ punkt.dajX() + ", "+ punkt.dajY() +")");
		
	}

}
