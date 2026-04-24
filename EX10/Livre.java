package EX10;

public class Livre extends Document implements Empruntable{
	int nombreDePages;
	String genre;
	public Livre(int id,String titre,String auteur,int pages,String genre) {
		super(id,titre,auteur);
		this.nombreDePages=pages;
		this.genre=genre;
	}
    public boolean estDisponible(){
        return disponible;
    }
    public void reserver(){
        System.out.println("Livre reserve: "+titre);
    }
    public int calculerDureeEmpruntMax(){
        return 20;
    }
    public void afficherDetails(){
        afficherInformations();
        System.out.println("Pages: " + nombreDePages + ", Genre: " + genre);
    }
    public void recommander(){
        System.out.println("Nous recommandons ce livre: " + titre);
    }
	
}
