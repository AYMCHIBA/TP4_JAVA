package TP4;
import java.util.Scanner;
public class Etudiant extends Personne{
	String niveau_etude;
	double moyenne;
	public Etudiant(String nom, String prenom, int age,String nv_etu,double moy) {
		super(nom, prenom, age);
		this.niveau_etude=nv_etu;
		this.moyenne=moy;
	}
	public String calculerMention() {
		if(moyenne<10) {
			return "non admis";
		}else if(moyenne<12){
			return "pasable";
		}else if(moyenne<14){
			return "assez bien";
		}else if(moyenne<16) {
			return "bien";
		}else {
			return "tres bien";
		}
	}
	public boolean estAdmis() {
		if(moyenne>=10) {
			return true;
		}else return false;
	}
	public void afficherProfile() {
		super.sePresenter();
		System.out.println("Mon niveau d etude est : "+niveau_etude+
				",j ai eu un mention \""+this.calculerMention()+"\" avec un moyenne generale :"
						+ " "+moyenne);
	}
	public static void main(String[] args) {
		String nom,prenom,niveau_etude;
		int age;
		double moy;
		Scanner in=new Scanner(System.in);
		System.out.print("entrer NOM: ");
		nom=in.nextLine();
		System.out.print("entrer Prenom ");
		prenom=in.nextLine();
		System.out.print("entrer age: ");
		age=in.nextInt();
		System.out.print("entrer Niveau d etude: ");
		niveau_etude=in.next();
		System.out.print("entrer votre moyenne: ");
		moy=in.nextDouble();
		Etudiant E1=new Etudiant(nom,prenom,age,niveau_etude,moy);
		E1.afficherProfile();
	}
}


