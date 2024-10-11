package Entite;

public abstract class Employe {
    private int identifiant;
    private String nom;
    private String adresse;
    private int nbr_heures;

    public Employe(int identifiant, String nom, String adresse, int nbr_heures) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heures = nbr_heures;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNbr_heures() {
        return nbr_heures;
    }

    public abstract double calculerSalaire();

    @Override
    public String toString() {
        return "Employe{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", nbr_heures=" + nbr_heures +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employe employe = (Employe) o;

        if (identifiant != employe.identifiant) return false;
        if (nbr_heures != employe.nbr_heures) return false;
        if (!nom.equals(employe.nom)) return false;
        return adresse.equals(employe.adresse);
    }
}
