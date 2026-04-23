package EX7;

public class Cercle extends Forme{
	double rayon;
	Cercle(double r){
		rayon=r;
	}
	double calculersurface() {
		return Math.PI*rayon*rayon;
	}
	double calculerPerimetre() {
		return 2*Math.PI*rayon;
	}
	boolean validerDimensions() {
		return rayon>0;
	 }
}
