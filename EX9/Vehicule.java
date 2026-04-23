package EX9;

public abstract class Vehicule {
	double vitesse;
	public Vehicule(double vitesse) {
		this.vitesse = vitesse;
	}
	void accelerer(double V) {
		vitesse+=V;
		 System.out.println("Vitesse: " + vitesse);
	}
	public void freiner(double f) {
		vitesse -= f;
		if (vitesse < 0)
			vitesse = 0;
		System.out.println("Vitesse" + vitesse);
	}
	public abstract void demarrer();
}
	
	

