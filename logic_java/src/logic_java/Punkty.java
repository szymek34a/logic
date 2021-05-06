package logic_java;

public class Punkty {
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
	public Punkty() {}
	public Punkty(Punkty pkt) {
		wspX = pkt.wspX;
		wspY = pkt.wspY;
	}
}
