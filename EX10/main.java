package EX10;

public class main {
	public static void main(String[] args){
        Bibliotheque b = new Bibliotheque();
        Document D1 = new Livre(10,"C","Adam",400,"IT");
        Document D2 = new Magazine(22,"ROBOTIQUE","Nabil",120,"2024");
        Document D3 = new DocumentNumerique(43,"NFT","AHMED","PDF",8.8);
        b.ajouter(D1);
        b.ajouter(D2);
        b.ajouter(D3);
        for (Document d : b.docs){
            d.afficherInformations();
            System.out.println("Duree d emprunte :"+d.calculerDureeEmpruntMax());
        }
        b.rechercher("Java");

        System.out.println("Livre qui Disponibles");
        b.disponibles();
    }
}
