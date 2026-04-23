package EX5;

public class Figure {
	void dessiner() {
		System.out.println("Dessiner la figure");
	}
	void deplacer(int x ,int y) {
		System.out.println("Deplacer vers (" + x + "," + y + ")");
	}
	void redimensionner(double facteur) {
		System.out.println("Redimensionner la figure de " + facteur);
	}
}
