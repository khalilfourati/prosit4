package Entite;

public class Caissier extends Employe {
    private int numeroDeCaisse;

    public Caissier(int identifiant, String nom, String adresse, int nbr_heures, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public double calculerSalaire() {
        double salaire = getNbr_heures() * 5;
        if (getNbr_heures() > 180) {
            salaire += (getNbr_heures() - 180) * 5 * 0.15;
        }
        return salaire;
    }

    @Override
    public String toString() {
        return super.toString() + ", Caissier{" +
                "numeroDeCaisse=" + numeroDeCaisse +
                '}';
    }
}
