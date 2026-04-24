package EX10;

public abstract class Document{
	int ID;
	String titre;
	String auteur;
	boolean disponible=true;
	Document(int id,String titre,String auteur){
		this.ID=id;
		this.titre=titre;
		this.auteur=auteur;
	}
	void emprunter(){
		if (disponible){	
			disponible = false;
            System.out.println("Document emprunte: " + titre);
        } else
            System.out.println("Document non disponible");
    }
	 void retourner(){
	        disponible = true;
	        System.out.println("Document retourne: "+titre);
	 }
	 void afficherInformations() {
	        System.out.println("ID: " + ID + ", Titre: " + titre + ", Auteur: " + auteur + ", Disponible: " + disponible);
	 }
	 abstract int calculerDureeEmpruntMax();
}

