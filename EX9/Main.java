package EX9;

public class Main {
	public static void main(String[] args) {
        Vehicule v1 = new VoitureElectrique(40,50);
        v1.demarrer();
        v1.accelerer(60);
        Vehicule v2 = new Moto(50,"Sport");
        v2.demarrer();
        v2.accelerer(30);
        VoitureElectrique ve = (VoitureElectrique) v1;
        ve.charger();
        ve.verifierBatterie();
        ve.afficherAutonomie();
        Moto m = (Moto) v2;
        m.faireRoueArriere();
        m.afficherTypeMoto();
    }
}
