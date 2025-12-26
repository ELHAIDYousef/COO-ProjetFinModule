package pizzeria.produits;

import pizzeria.fabrique.FabriqueIngredientsPizza;

public class PizzaFromage extends Pizza {
    private FabriqueIngredientsPizza fabriqueIngredients;

    public PizzaFromage(FabriqueIngredientsPizza fabriqueIngredients) {
        this.fabriqueIngredients = fabriqueIngredients;
    }

    @Override
    public void preparer() {
        System.out.println("Préparation de " + nom);
        pate = fabriqueIngredients.creerPate();
        sauce = fabriqueIngredients.creerSauce();
        fromage = fabriqueIngredients.creerFromage();
    }
}