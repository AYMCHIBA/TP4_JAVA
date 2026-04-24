package EX10;

import java.util.ArrayList;
import java.util.List;
public class Bibliotheque{
	List<Document> docs = new ArrayList<>();
	void ajouter(Document d){
        docs.add(d);
    }
	void rechercher(String mot){
		for (Document d : docs){
				if (d.titre.contains(mot) || d.auteur.contains(mot)){
	                d.afficherInformations();
				}
		}
	}
	public static List<Document> documentsDisponibles(List<Document> docs){
		List<Document> result = new ArrayList<>();
		for (int i = 0; i < docs.size(); i++){
			if (docs.get(i).disponible){
				result.add(docs.get(i));
			}
		}
		return result;
	}
	void disponibles(){
        for (Document d : docs){
            if (d.disponible){
                System.out.println(d.titre);
            }
        }
    }
	public static double calculerPenalite(int joursRetard){
		return joursRetard * 2.0;
	}
	

}
