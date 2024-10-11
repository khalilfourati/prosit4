package Entite;

public class Responsable extends Employe {
    private double prime;

    public Responsable(int identifiant, String nom, String adresse, int nbr_heures, double prime) {
        super(identifiant, nom, adresse, nbr_heures);
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        double salaire = getNbr_heures() * 10 + prime;
        if (getNbr_heures() > 160) {
            salaire += (getNbr_heures() - 160) * 10 * 0.20;
        }
        return salaire;
    }

    public double getPrime() {
        return prime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Responsable{" +
                "prime=" + prime +
                '}';
    }
}
