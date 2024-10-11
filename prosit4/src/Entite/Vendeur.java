package Entite;

public class Vendeur extends Employe {
    private double tauxDeVente;

    public Vendeur(int identifiant, String nom, String adresse, int nbr_heures, double tauxDeVente) {
        super(identifiant, nom, adresse, nbr_heures);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public double calculerSalaire() {
        return 450 * tauxDeVente;
    }

    @Override
    public String toString() {
        return super.toString() + ", Vendeur{" +
                "tauxDeVente=" + tauxDeVente +
                '}';
    }
}
