package EX5;

public class Main {
	public static void main(String[] args) {
		Figure c=new Cercle(5);
		c.dessiner();
		c.deplacer(10, 4);
		c.redimensionner(2);
		System.out.println("Perimetre cercle: " + ((Cercle)c).calculerPerimetre());
		System.out.println("Surface cercle: " + ((Cercle)c).calculerSurface());
		Figure T=new Triangle(6,2,4,6,5);
		T.dessiner();
		System.out.println("Perimetre Triangle: " + ((Triangle)T).calculerPerimetre());
		System.out.println("Surface Traingle: " + ((Triangle)T).calculerSurface());
	}
}
