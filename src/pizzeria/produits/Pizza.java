package pizzeria.produits;

import pizzeria.fabrique.*;

public abstract class Pizza {
    protected String nom;
    protected Pate pate;
    protected Sauce sauce;
    protected Legume legumes[];
    protected Fromage fromage;
    protected Poivrons poivrons;
    protected Moules moules;


    public abstract void preparer();

    public void cuire() {
        System.out.println("Cuisson 25 minutes à 180°C");
    }

    public void couper() {
        System.out.println("Découpage en parts triangulaires");
    }

    public void emballer() {
        System.out.println("Emballage dans une boîte officielle");
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public String toString() {
        return nom;
    }
}