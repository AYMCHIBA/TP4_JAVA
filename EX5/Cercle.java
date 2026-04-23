package EX5;

public class Cercle extends Figure{
	double rayon;
	Cercle(double r) {
		rayon=r;
	}
	void dessiner() {
		System.out.println("Dessiner Cercle");
	}
	double calculerPerimetre() {
        return  Math.PI*rayon*2;
    }

    double calculerSurface() {
        return Math.PI*rayon*rayon;//Math.pow(rayon,2)
    }
	
}
