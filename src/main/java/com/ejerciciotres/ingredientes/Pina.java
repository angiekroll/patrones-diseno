package com.ejerciciotres.ingredientes;

import java.math.BigDecimal;

public class Pina extends Ingrediente{
    private BigDecimal PRECIO_BASE = new BigDecimal(2.5);

    public Pina(int cantidad) {
        super(cantidad);
    }

    @Override
    public BigDecimal calcularPrecio() {
        return PRECIO_BASE.multiply(BigDecimal.valueOf(super.cantidad));
    }
}