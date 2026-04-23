package EX5;

public class Triangle extends Figure{
	double a,b,c,base,hauteur;
	Triangle(double a,double b,double c,double base,double hauteur){
		this.a = a;
		this.b = b;
		this.c = c;
		this.base = base;
		this.hauteur = hauteur;
	}
	public void dessiner() {
		System.out.println("Dessiner Triangle");
	}
	public double calculerPerimetre() {
		return a+b+c;
	}
	public double calculerSurface() {
		return (base*hauteur)/2;
	}
	
}
