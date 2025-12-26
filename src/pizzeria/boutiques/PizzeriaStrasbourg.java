package pizzeria.boutiques;

import pizzeria.produits.*;
import pizzeria.ingredients.FabriqueIngredientsPizzaStrasbourg;
import pizzeria.fabrique.FabriqueIngredientsPizza;

public class PizzeriaStrasbourg extends Pizzeria {

    @Override
    protected Pizza creerPizza(String item) {
        Pizza pizza = null;
        FabriqueIngredientsPizza fabriqueIngredients = new FabriqueIngredientsPizzaStrasbourg();

        if (item.equals("fromage")) {
            pizza = new PizzaFromage(fabriqueIngredients);
            pizza.setNom("Pizza au fromage style Strasbourg");
        } else if (item.equals("vegetarienne")) {
            pizza = new PizzaVegetarienne(fabriqueIngredients);
            pizza.setNom("Pizza végétarienne style Strasbourg");
        } else if (item.equals("fruitsDeMer")) {
            pizza = new PizzaFruitsDeMer(fabriqueIngredients);
            pizza.setNom("Pizza aux fruits de mer style Strasbourg");
        } else if (item.equals("poivrons")) {
            pizza = new PizzaPoivrons(fabriqueIngredients);
            pizza.setNom("Pizza aux poivrons style Strasbourg");
        }
        return pizza;
    }
}