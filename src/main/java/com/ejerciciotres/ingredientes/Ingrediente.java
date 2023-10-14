package com.ejerciciotres.ingredientes;

import java.math.BigDecimal;

public abstract class Ingrediente {
    protected int cantidad;

    public Ingrediente(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public abstract BigDecimal calcularPrecio();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (" + this.cantidad + ")";
    }
}
