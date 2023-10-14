package com.ejerciciotres;

import com.ejerciciotres.factory.PizzaMedianaFactoria;
import com.ejerciciotres.ingredientes.Ingrediente;
import com.ejerciciotres.ingredientes.Jamon;
import com.ejerciciotres.ingredientes.Queso;
import com.ejerciciotres.masas.MasaDelgada;
import com.ejerciciotres.pizzas.Pizza;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        PizzaBuilder builder = new PizzaBuilder(new PizzaMedianaFactoria())
                .agregarMasa(new MasaDelgada())
                .agregarExtraQueso(true);

        HashSet<Ingrediente> ingredientes = new HashSet<Ingrediente>();
        ingredientes.add(new Queso(10));
        ingredientes.add(new Jamon(2));

        builder.agregarIngredientes(ingredientes);
        builder.verResumenPizza();

        Pizza pizza = builder.crearPizza();
        System.out.println("El valor final de la pizza es: $" + pizza.calcularPrecio());
    }
}