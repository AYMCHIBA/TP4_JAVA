package EX9;

public class Moto extends Vehicule{
	String type;
	Moto(double vitesse,String type){
		super(vitesse);
		this.type=type;
	}
	public void demarrer(){
		System.out.println("Moto démarre ");
	}
	void faireRoueArriere(){
        System.out.println("La moto fait une roue arrière !");
    }
    void afficherTypeMoto(){
        System.out.println("Type de moto: " +type);
    }
}
