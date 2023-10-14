package com.ejerciciotres.pizzas;

import com.ejerciciotres.ingredientes.Ingrediente;
import com.ejerciciotres.masas.Masa;
import com.ejerciciotres.pizzas.Pizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;

public class PizzaGrande extends Pizza {

    public PizzaGrande(Masa tipoMasa, HashSet<Ingrediente> ingredientes, boolean tieneExtraQueso) {
        super(tipoMasa, ingredientes, tieneExtraQueso);
    }

    @Override
    public BigDecimal calcularPrecio() {
        BigDecimal precioFinal = new BigDecimal(0);
        for (Ingrediente adicion : super.adiciones) {
            precioFinal = precioFinal.add(adicion.calcularPrecio());
        }
        return precioFinal;
    }
}
