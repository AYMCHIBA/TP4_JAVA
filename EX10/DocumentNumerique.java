package EX10;

public class DocumentNumerique extends Document implements Consultable{
	String format;
	double tailleFichier;
	DocumentNumerique(int id, String titre, String auteur, String format, double taille){
        super(id, titre, auteur);
        this.format = format;
        this.tailleFichier = taille;
    }
	int calculerDureeEmpruntMax(){
		return 10; 
	}
	public void consulter(){
        System.out.println("Consultation du document numerique");
    }
    public void afficherResume(){
        System.out.println("Resume du document numerique");
    }
    void telecharger(){
        System.out.println("Telechargement de Document");
    }
    void afficherTaille(){
        System.out.println("Taille: " + tailleFichier + " MB");
    }
}
