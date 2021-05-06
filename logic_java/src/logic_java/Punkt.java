package logic_java;

public class Punkt {
	int wspX;
	int wspY;
	
	int x;
	int y;
	
	public Punkt(int a, int b) {
		x = a;
		y = b;
	}

	public Punkt() {
	}

	public Punkt(Punkt pkt) {
		x = pkt.x;
		y = pkt.y;
	}

	void ustawX(int x) {
		wspX = x;
	}

	void ustawY(int y) {
		wspY = y;
	}
	
	int dajX() {
		return wspX;
	}

	int dajY() {
		return wspY;
	}
	
}
