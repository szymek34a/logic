package logic_java;

class Punkty {
	int wspX;
	int wspY;
	
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
	
	public Punkty(int a, int b) {
		wspX = a;
		wspY = b;
	}
}
