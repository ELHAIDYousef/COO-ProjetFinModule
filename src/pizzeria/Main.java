package pizzeria;

import pizzeria.boutiques.Pizzeria;
import pizzeria.boutiques.PizzeriaBrest;
import pizzeria.boutiques.PizzeriaStrasbourg;
import pizzeria.produits.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizzeria boutiqueBrest = new PizzeriaBrest();
        Pizzeria boutiqueStrasbourg = new PizzeriaStrasbourg();

        System.out.println("--- Commande chez Brest ---");
        Pizza pizzaBrest = boutiqueBrest.commanderPizza("fromage");
        System.out.println("Yousef a commandé une " + pizzaBrest.getNom() + "\n");

        System.out.println("--- Commande chez Strasbourg ---");
        Pizza pizzaStrasbourg = boutiqueStrasbourg.commanderPizza("fromage");
        System.out.println("Yousef a commandé une " + pizzaStrasbourg.getNom() + "\n");

        System.out.println("--- Test Pizza Fruits de Mer à Brest ---");
        boutiqueBrest.commanderPizza("fruitsDeMer");
    }
}