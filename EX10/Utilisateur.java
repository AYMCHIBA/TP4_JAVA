package EX10;

import java.util.ArrayList;

public class Utilisateur{
	int id;
	String nom;
	ArrayList<Document> historique = new ArrayList<>();
	Utilisateur(int identifiant, String nom){
	        this.id = identifiant;
	        this.nom = nom;
	}
	void emprunterDocument(Document d){
        if (d.disponible){
            d.emprunter();
            historique.add(d);
            System.out.println(nom + " a emprunté: " + d.titre);
        } else {
            System.out.println("Document non disponible");
        }
    }
	void retournerDocument(Document d){
        d.retourner();
        System.out.println(nom + " a retourné: " + d.titre);
    }

    void afficherHistorique(){
        System.out.println("Historique de " + nom+": ");
        for (Document d : historique){
            System.out.println("- " + d.titre);
        }
    }
}
