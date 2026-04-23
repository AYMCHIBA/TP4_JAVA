package EX8;

public class Main {
	public static void main(String[] args) {
		Volant v1 = new Oiseau();
	    v1.voler();
	    v1.changerAltitude(800);
	    Volant v2 = new Avion();
	    v2.voler();
	    v2.changerAltitude(20000);
	    ((Oiseau)v1).construireNid();
	    ((Avion)v2).embarquerPassagers();
	    Oiseau o = new Oiseau();
	    o.migrer();
	    o.construireNid();
	    Avion a = new Avion();
	    a.changerAltitude(2000);
	    a.embarquerPassagers();
	    a.afficherAltitude();
	}
}

