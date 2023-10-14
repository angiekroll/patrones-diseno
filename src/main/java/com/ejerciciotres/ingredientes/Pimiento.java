package com.ejerciciotres.ingredientes;

import java.math.BigDecimal;

public class Pimiento extends Ingrediente{
    private final BigDecimal PRECIO_BASE = new BigDecimal(2);

    public Pimiento(int cantidad) {
        super(cantidad);
    }

    @Override
    public BigDecimal calcularPrecio() {
        return PRECIO_BASE.multiply(BigDecimal.valueOf(super.cantidad));
    }
}