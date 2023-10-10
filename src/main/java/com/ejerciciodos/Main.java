package com.ejerciciodos;

import com.ejerciciodos.metodopago.*;
import com.ejerciciodos.metodopago.nuevosistemapago.PagoNuevoSistema;
import java.math.BigDecimal;

public class Main {

  public static void main(String[] args) {
    SistemaPago pagoTarjetaCredito = new PagoTarjetaCredito();
    SistemaPago pagoPayPal = new PagoPayPal();
    SistemaPago nuevoSistemaPagoAdapter = new PagoNuevoSistemaAdapter();
    ServicioPagos servicioPagos = new ServicioPagos();
    // Ejecución
    servicioPagos.realizarPago(pagoTarjetaCredito, new BigDecimal(500));
    servicioPagos.realizarPago(pagoTarjetaCredito, new BigDecimal(150));
    servicioPagos.realizarPago(pagoTarjetaCredito, new BigDecimal(90));
  }
}