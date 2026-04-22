package TP4;

import java.util.Scanner;

public class Voiture extends Vehicule{
	int nbr_portes;
	String carburant;
	public Voiture(String marque,int nb_port,String carbur) {
		super(marque);
		this.nbr_portes=nb_port;
		this.carburant=carbur;
	}
	void afficherDetails() {
		afficherMarque();
		System.out.println("le nombre de porte: "+nbr_portes);
		System.out.println("Carburant: "+carburant);
	}
	void klaxonner() {
		System.out.println("titit!!");
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String mar;
		System.out.print("entrer marque: ");
		mar=in.nextLine();
		Voiture v = new Voiture(mar,4,"Gasoil");
        v.afficherDetails();
        v.klaxonner();
        v.afficherMarque(); 
	}
}

	

