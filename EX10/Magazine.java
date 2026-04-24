package EX10;

public class Magazine extends Document implements Empruntable{
	int numero;
	String datePublication;
	Magazine(int id, String titre, String auteur, int numero, String date){
        super(id, titre, auteur);
        this.numero = numero;
        this.datePublication = date;
    }
    int calculerDureeEmpruntMax(){
        return 10; 
    }
    public boolean estDisponible(){
        return disponible;
    }
    public void reserver(){
        if (disponible){
            disponible = false;
            System.out.println("Magazine réservé");
        } else{
            System.out.println("Magazine non disponible");
        }
    }
    boolean estRecent(){
        return true; 
    }
    void afficherEdition(){
        System.out.println("Numero: " + numero);
        System.out.println("Date: " + datePublication);
    }
}
