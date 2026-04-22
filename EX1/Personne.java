package TP4;

import java.util.Scanner;

public class Personne{
	String nom;
	String prenom;
	int age;
	public Personne(String nom,String prenom,int age){
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
	}
	public void afficherInformations() {
		System.out.println("Nom: "+nom+"\nPrenom : "+prenom+"\nAge : "+age);
	}
	public boolean estMajeur() {
		if(age>=18) {
			return true;
		}else return false;
	}
	public void sePresenter() {
		System.out.println("Bonjour,je m appelle "+nom+" "+prenom+" ,j ai "+age+" age.");
		//return "Bonjour,je m appelle "+nom+""+prenom+" ,j ai "+age+" age.";
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String nom,prenom;
		int age;
		System.out.println("entrer NOM:");
		nom=in.nextLine();
		System.out.println("entrer Prenom");
		prenom=in.nextLine();
		System.out.println("entrer age: ");
		age=in.nextInt();
		Personne P1=new Personne(nom,prenom,age);
		P1.afficherInformations();
		if(P1.estMajeur() == true) {
		System.out.println("ce personne est Majeur"); 
		}else System.out.println("ce personne est pas majeur ");
		P1.sePresenter();
		}
}

