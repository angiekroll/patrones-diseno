package com.ejerciciotres.pizzas;

import com.ejerciciotres.ingredientes.Ingrediente;
import com.ejerciciotres.masas.Masa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;

public abstract class Pizza {
    protected HashSet<Ingrediente> adiciones;
    protected Masa tipoMasa;
    protected boolean tieneExtraQueso;

    public Pizza() {
    }

    public Pizza(Masa masa, HashSet<Ingrediente> ingredientes, boolean extraQueso) {
        this.adiciones = ingredientes;
        this.tipoMasa = masa;
        this.tieneExtraQueso = extraQueso;
    }

    public void agregarIngrediente(HashSet<Ingrediente> ingredientes) {
        this.adiciones = ingredientes;
    }

    public void agregarMasa(Masa tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public abstract BigDecimal calcularPrecio();
}
