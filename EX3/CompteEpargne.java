package TP4;

public class CompteEpargne extends Compte{
	double taux;
	CompteEpargne(double solde, double taux){
		super(solde);
		this.taux=taux;
	}
	double calculerInterets() {
		return solde*taux;
	}
	void ajouterInterets() {
		double interet=calculerInterets();
		solde+=interet;
		System.out.println("Interets sont ajoutes");
	}
	void afficher() {
		System.out.println("Compte Epargne");
        System.out.println("Solde: " + solde);
        System.out.println("Taux: " + taux);
	}
	public static void main(String[] args) {
		CompteEpargne c2 = new CompteEpargne(5000, 0.2);
        c2.ajouterInterets();
        c2.afficher();
	}
}


