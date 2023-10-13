package com.ejerciciotres.ingredientes;

import java.math.BigDecimal;

public class Cebolla extends Ingrediente{
    private BigDecimal PRECIO_BASE = new BigDecimal(8);

    public Cebolla(int cantidad) {
        super(cantidad);
    }

    @Override
    public BigDecimal calcularPrecio() {
        return PRECIO_BASE.multiply(BigDecimal.valueOf(super.cantidad));
    }
}