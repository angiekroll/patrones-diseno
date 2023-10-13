package com.ejerciciotres.ingredientes;

import java.math.BigDecimal;

public class Aceituna extends Ingrediente{
    private BigDecimal PRECIO_BASE = new BigDecimal(3);

    public Aceituna(int cantidad) {
        super(cantidad);
    }

    @Override
    public BigDecimal calcularPrecio() {;
        return PRECIO_BASE.multiply(BigDecimal.valueOf(super.cantidad));
    }

}
