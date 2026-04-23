package EX8;

public class Avion implements Volant{	
	double altitude;
	 public void voler() {
		 System.out.println("L'avion vole");
	 }
	 public void atterrir() {
		 System.out.println("L'avion atterrit");
	 }
	 public void changerAltitude(double altitude) {
		 this.altitude = altitude;
		 System.out.println("Altitude de l'avion: " + altitude);
	 }
	 public void embarquerPassagers() {
		 System.out.println("Les passagers embarquent dans l'avion");
	 }
	 public void afficherAltitude() {
		 System.out.println("Altitude est : " + altitude);
	 }
}
