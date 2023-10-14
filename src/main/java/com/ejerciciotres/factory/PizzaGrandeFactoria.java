package com.ejerciciotres.factory;

import com.ejerciciotres.ingredientes.Ingrediente;
import com.ejerciciotres.masas.Masa;
import com.ejerciciotres.pizzas.Pizza;
import com.ejerciciotres.pizzas.PizzaGrande;

import java.util.HashSet;

public class PizzaGrandeFactoria implements PizzaFactory {
    @Override
    public Pizza crearPizza(Masa tipoMasa, HashSet<Ingrediente> ingredientes, boolean tieneExtraQueso) {
        return new PizzaGrande(tipoMasa, ingredientes, tieneExtraQueso);
    }
}
