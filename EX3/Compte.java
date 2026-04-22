package TP4;

public class Compte {
	double solde;
	Compte(double solde){
		this.solde=solde;
	}
	void deposer(double montant) {
		this.solde+=montant;
	}
	void retirer(double montant) {
		if(this.solde >= montant)
			this.solde-=montant;
		else System.out.println("solde INSUFFISANT");	
	}
	double consulterSolde() {
		return solde;
	}
	void afficher() {
		System.out.println("Solde est : "+this.solde);
	}
	public static void main(String[] args) {
		Compte C1=new Compte(4000);
		C1.afficher();
		C1.deposer(200);
		C1.afficher();
		C1.retirer(500);
		C1.afficher();
	}

}
