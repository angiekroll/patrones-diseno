package com.ejerciciotres.ingredientes;

import java.math.BigDecimal;

public class Champinon extends Ingrediente{
    private final BigDecimal PRECIO_BASE = new BigDecimal(10);

    public Champinon(int cantidad) {
        super(cantidad);
    }

    @Override
    public BigDecimal calcularPrecio() {
        return PRECIO_BASE.multiply(BigDecimal.valueOf(super.cantidad));
    }
}