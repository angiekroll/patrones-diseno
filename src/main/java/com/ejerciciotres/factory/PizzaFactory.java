package com.ejerciciotres.factory;

import com.ejerciciotres.ingredientes.Ingrediente;
import com.ejerciciotres.masas.Masa;
import com.ejerciciotres.pizzas.Pizza;

import java.util.HashSet;

public interface PizzaFactory {
    Pizza crearPizza(Masa tipoMasa, HashSet<Ingrediente> ingredientes, boolean tieneExtraQueso);
}
