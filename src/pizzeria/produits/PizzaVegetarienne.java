package pizzeria.produits;

import pizzeria.fabrique.FabriqueIngredientsPizza;

public class PizzaVegetarienne extends Pizza {
    private FabriqueIngredientsPizza fabriqueIngredients;

    public PizzaVegetarienne(FabriqueIngredientsPizza fabriqueIngredients) {
        this.fabriqueIngredients = fabriqueIngredients;
    }

    @Override
    public void preparer() {
        System.out.println("Préparation de " + nom);
        pate = fabriqueIngredients.creerPate();
        sauce = fabriqueIngredients.creerSauce();
        fromage = fabriqueIngredients.creerFromage();
        legumes = fabriqueIngredients.creerLegumes();
    }
}