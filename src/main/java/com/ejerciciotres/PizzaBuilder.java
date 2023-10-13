package com.ejerciciotres;

import com.ejerciciotres.factory.PizzaFactory;
import com.ejerciciotres.ingredientes.Ingrediente;
import com.ejerciciotres.masas.Masa;
import com.ejerciciotres.pizzas.Pizza;
import com.ejerciciotres.pizzas.PizzaMediana;

import java.util.ArrayList;
import java.util.HashSet;

public class PizzaBuilder {
    private PizzaFactory factory;
    private HashSet<Ingrediente> ingredientes;
    private Masa tipoMasa;
    private boolean tieneExtraQueso;

    public PizzaBuilder(PizzaFactory factory) {
        this.factory = factory;
    }

    public PizzaBuilder agregarIngredientes(HashSet<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
        return this;
    }

    public PizzaBuilder agregarMasa(Masa tipoMasa) {
        this.tipoMasa = tipoMasa;
        return this;
    }

    public PizzaBuilder agregarExtraQueso(boolean tieneExtraQueso) {
        this.tieneExtraQueso = tieneExtraQueso;
        return this;
    }

    public void verResumenPizza() {
        System.out.println("[!] Tu orden llevará los siguiente ingredientes: ");
        for (Ingrediente ingrediente: ingredientes) {
            System.out.println("---- " + ingrediente + " x $" + ingrediente.calcularPrecio());
        }
        System.out.println("[!] Tipo de masa: " + this.tipoMasa.getClass().getSimpleName().replaceAll("Masa", ""));
        System.out.println("[!] Tiene adicion extra de queso?: " + (this.tieneExtraQueso ?  "Si" : "No"));
    }

    public Pizza crearPizza() {
        return this.factory.crearPizza(this.tipoMasa, this.ingredientes, this.tieneExtraQueso);
    }
}
