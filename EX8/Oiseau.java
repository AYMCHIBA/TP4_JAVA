package EX8;

public class Oiseau implements Volant{
	double altitude;
	public void voler() {
		System.out.println("L'oiseau vole");
	}
	public void atterrir() {
		System.out.println("L'oiseau atterrit");
	}
	public void changerAltitude(double altitude) {
		this.altitude = altitude;
		System.out.println("Altitude de l'oiseau: " + altitude);
	}
	public void migrer() {
		System.out.println("L'oiseau migre");
	}
	public void construireNid() {
		System.out.println("L'oiseau construit un nid");
	}
}
