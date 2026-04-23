package EX7;

public abstract class Forme {
	abstract double calculersurface();
	void afficherDescription() {
        System.out.println("Une forme geometrique");
    }
	void comparerSurface(Forme f) {
		if (this.calculersurface() > f.calculersurface()) {
            System.out.println("Cette forme est plus grande");
        } else if (this.calculersurface() < f.calculersurface()) {
            System.out.println("L'autre forme est plus grande");
        } else {
            System.out.println("Les deux formes ont la même surface");
        }
    }
}


