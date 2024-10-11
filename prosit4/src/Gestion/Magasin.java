package Gestion;

import Entite.Employe;
import Entite.Produit;

public class Magasin {
    private int id;
    private String adresse;
    private final int CAPACITE = 50;
    private final int MAX_EMPLOYES = 20;
    private int comp;
    private int compEmployes;
    private Produit[] tabprod = new Produit[CAPACITE];
    private Employe[] employes = new Employe[MAX_EMPLOYES];
    private static int total;

    public Magasin(int id, String adresse) {
        this.id = id;
        this.adresse = adresse;
    }

    public void ajouterProduit(Produit p) {
        if (comp < CAPACITE) {
            if (!chercherProduit(p)) {
                tabprod[comp] = p;
                comp++;
                total++;
            } else {
                System.out.println("Le produit existe déjà");
            }
        } else {
            System.out.println("Magasin plein");
        }
    }

    public void ajouterEmploye(Employe e) {
        if (compEmployes < MAX_EMPLOYES) {
            employes[compEmployes] = e;
            compEmployes++;
        } else {
            System.out.println("Nombre maximum d'employés atteint");
        }
    }

    public static int getTotal() {
        return total;
    }

    public void afficherMarquePro() {
        for (int i = 0; i < comp; i++) {
            System.out.println("Marque :" + tabprod[i].getMarque());
        }
    }

    public void afficherEmployes() {
        for (int i = 0; i < compEmployes; i++) {
            System.out.println(employes[i]);
        }
    }

    public void afficherPrimesResponsables() {
        for (int i = 0; i < compEmployes; i++) {
            if (employes[i] instanceof Responsable) {
                System.out.println("Prime de " + employes[i].getNom() + ": " + ((Responsable) employes[i]).getPrime());
            }
        }
    }50

    public void afficherSalairesEmployes() {
        for (int i = 0; i < compEmployes; i++) {
            System.out.println("Salaire de " + employes[i].getNom() + ": " + employes[i].calculerSalaire());
        }
    }

    public String toString() {
        StringBuilder str = new StringBuilder("L'ensemble des produits\n");
        for (int i = 0; i < comp; i++) {
            str.append(tabprod[i]).append("\n");
        }
        str.append("L'ensemble des employés\n");
        for (int i = 0; i < compEmployes; i++) {
            str.append(employes[i]).append("\n");
        }
        return "L'id :" + id + " l'adresse :" + adresse + "\n" + str;
    }

    public boolean chercherProduit(Produit p) {
        for (int i = 0; i < comp; i++) {
            if (Produit.comparer(p, tabprod[i])) {
                return true;
            }
        }
        return false;
    }

    public Magasin plusProduit(Magasin m) {
        if (this.comp < m.comp) return m;
        else if (this.comp > m.comp) return this;
        else return null;
    }

    public static Magasin plusProduit(Magasin m1, Magasin m2) {
        if (m1.comp < m2.comp) return m2;
        else if (m1.comp > m2.comp) return m1;
        else return null;
    }

    public int chercherProduitIndice(Produit p) {
        for (int i = 0; i < comp; i++) {
            if (Produit.comparer(p, tabprod[i])) return i;
        }
        return -1;
    }

    public boolean supprimerProduit(Produit p) {
        int indice = chercherProduitIndice(p);
        if (indice != -1) {
            for (int i = indice; i < comp - 1; i++) {
                tabprod[i] = tabprod[i + 1];
            }
            tabprod[comp - 1] = null;
            comp--;
            total--;
            return true;
        }
        return false;
    }
}
