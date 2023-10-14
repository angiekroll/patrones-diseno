package com.ejerciciotres.ingredientes;

import java.math.BigDecimal;

public class Pepperoni extends Ingrediente{
    private final BigDecimal PRECIO_BASE = new BigDecimal(5);

    public Pepperoni(int cantidad) {
        super(cantidad);
    }

    @Override
    public BigDecimal calcularPrecio() {
        return PRECIO_BASE.multiply(BigDecimal.valueOf(super.cantidad));
    }
}
