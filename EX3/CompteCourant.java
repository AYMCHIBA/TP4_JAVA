package TP4;

public class CompteCourant extends Compte{
	double decouvert;
	CompteCourant(double solde, double decouvert){
		super(solde);
		this.decouvert=decouvert;
	}
	void autoriserDecouvert(double montant) {
		if(solde+decouvert>=montant) solde-=montant;
		else System.out.println("Découvert dépassé.");
	}
	double calculerFrais() {
		if(solde<0) return Math.abs(solde)*0.1;
		else return 0;
	}
	void afficher() {
        System.out.println("Compte Courant");
        System.out.println("Solde: " + solde);
        System.out.println("Decouvert: " + decouvert);
    }
	    public static void main(String[] args) {
	        CompteCourant c1 = new CompteCourant(-200, 500);
	        c1.retirer(0);
	        c1.afficher();
	        System.out.println("Frais: " + c1.calculerFrais());
	}
}
