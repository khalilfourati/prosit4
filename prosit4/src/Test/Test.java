package Test;

import Entite.*;
import Gestion.Magasin;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        // Creating two Magasin instances
        Magasin carrefour = new Magasin(1, "Carrefour", "Centre-Ville");
        Magasin monoprix = new Magasin(2, "Monoprix", "Menzah 6");

        // Creating employees
        Caissier caissier1 = new Caissier(1, "Ali", "Tunis", 190, 101);
        Responsable responsable1 = new Responsable(2, "Sami", "Ariana", 170, 200);
        Vendeur vendeur1 = new Vendeur(3, "Mouna", "Manouba", 160, 0.8);

        // Adding employees to Carrefour
        carrefour.ajouterEmploye(caissier1);
        carrefour.ajouterEmploye(responsable1);
        carrefour.ajouterEmploye(vendeur1);

        // Creating products
        Produit p1 = new Produit(1024, "Delice", "Lait");
        Produit p2 = new Produit(11, "Sicam", "Tomate", 1.2f, new Date());

        // Adding products to Carrefour
        carrefour.ajouterProduit(p1);
        carrefour.ajouterProduit(p2);

        // Displaying details of Carrefour
        System.out.println(carrefour);

        // Displaying salaries of employees
        carrefour.afficherSalairesEmployes();

        // Displaying primes of responsables
        carrefour.afficherPrimesResponsables();
    }
}
