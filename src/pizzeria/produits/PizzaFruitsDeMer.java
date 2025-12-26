package pizzeria.produits;

import pizzeria.fabrique.FabriqueIngredientsPizza;

public class PizzaFruitsDeMer extends Pizza {
    private FabriqueIngredientsPizza fabriqueIngredients;

    public PizzaFruitsDeMer(FabriqueIngredientsPizza fabriqueIngredients) {
        this.fabriqueIngredients = fabriqueIngredients;
    }

    @Override
    public void preparer() {
        System.out.println("Préparation de " + nom);
        pate = fabriqueIngredients.creerPate();
        sauce = fabriqueIngredients.creerSauce();
        fromage = fabriqueIngredients.creerFromage();
        moules = fabriqueIngredients.creerMoules();
    }
}