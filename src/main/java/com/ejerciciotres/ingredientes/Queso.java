package com.ejerciciotres.ingredientes;

import java.math.BigDecimal;

public class Queso extends Ingrediente{
    private BigDecimal PRECIO_BASE = new BigDecimal(10.5);

    public Queso(int cantidad) {
        super(cantidad);
    }

    @Override
    public BigDecimal calcularPrecio() {
        return PRECIO_BASE.multiply(BigDecimal.valueOf(super.cantidad));
    }
}