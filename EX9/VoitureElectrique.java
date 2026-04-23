package EX9;

public class VoitureElectrique extends Vehicule implements Electrique{
	double batterie;
	VoitureElectrique(double vitesse, double batterie) {
        super(vitesse);
        this.batterie = batterie;
    }
	public void demarrer(){
		System.out.println("voiture demarer");
	}
	public void charger(){
		batterie=10;
		System.out.println("voiture charge FULL");	
	}
	public void verifierBatterie(){
		System.out.println("NV de charge :"+batterie+"%");
	}	
	void afficherAutonomie(){
		 System.out.println("Autonomie:"+(batterie*3)+" km");
	}
	public void optimiserConsommation(){
	        System.out.println("voiture est en Mode optimisee");
	}
}
