package pizzeria.ingredients;

import pizzeria.fabrique.*;

public class FabriqueIngredientsPizzaStrasbourg implements FabriqueIngredientsPizza {

    @Override
    public Pate creerPate() {
        return new PateSoufflee();
    }

    @Override
    public Sauce creerSauce() {
        return new SauceTomatesCerise();
    }

    @Override
    public Fromage creerFromage() {
        return new Mozzarella();
    }

    @Override
    public Legume[] creerLegumes() {
        return new Legume[] { new Aubergine(), new Epinard(), new OliveNoire() };
    }

    @Override
    public Poivrons creerPoivrons() {
        return new PoivronsEnRondelles();
    }

    @Override
    public Moules creerMoules() {
        return new MoulesSurgelees();
    }
}