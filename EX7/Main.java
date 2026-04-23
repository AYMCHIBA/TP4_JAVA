package EX7;

public class Main {
	public static void main(String[] args) {
		Forme A=new Rectangle(2,4);
		A.afficherDescription();
		System.out.println("Surface rectangle:"+ A.calculersurface());
		Forme B=new Cercle(4);
		B.afficherDescription();
		System.out.println("Surface Cercle:"+ B.calculersurface());
		A.comparerSurface(B);
	}
}
