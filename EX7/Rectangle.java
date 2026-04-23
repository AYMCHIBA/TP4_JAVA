package EX7;

public class Rectangle extends Forme{
	double largeur,longeur;
	Rectangle(double largeur,double longeur){
		this.largeur = largeur;
		this.longeur = longeur;
	     
	}
	double calculersurface() {
	    return longeur * largeur;
	    }
	double calculerPerimetre() {
        return 2 * (longeur + largeur);
    }
	boolean validerDimensions() {
		return largeur>0 && longeur>0;
	 }
  

}
