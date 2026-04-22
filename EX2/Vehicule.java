package TP4;
import java.util.Scanner;

public class Vehicule {
	String marque;
	public Vehicule(String marque) {
		this.marque=marque;
	}
	public void afficherMarque() {
		System.out.println("Marque : "+marque);
	}
	public void demarer() {
		System.out.println("Vehicule start moving");
	}
	public void  arreter() {
		System.out.println("Vehicule Stop");
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String mar;
		System.out.print("entrer marque: ");
		mar=in.nextLine();
		Vehicule V1=new Vehicule(mar);
		V1.afficherMarque();
		V1.demarer();
		V1.arreter();

	}
}
