package com.ejerciciodos.metodopago;

import java.math.BigDecimal;

public class ServicioPagos {

    public void realizarPago(SistemaPago sistemaPago, BigDecimal monto){
        // validar datos para ejecutar Pago
        sistemaPago.ejecutarPago(monto);
    }
}
