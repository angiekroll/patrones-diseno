package com.ejerciciodos;

import com.ejerciciodos.metodopago.PagoNuevoSistemaAdapter;
import com.ejerciciodos.metodopago.PagoPayPal;
import com.ejerciciodos.metodopago.PagoTarjetaCredito;
import com.ejerciciodos.metodopago.ServicioPagos;
import com.ejerciciodos.metodopago.SistemaPago;

import java.math.BigDecimal;

public class Main {

  public static void main(String[] args) {
    SistemaPago pagoTarjetaCredito = new PagoTarjetaCredito();
    SistemaPago pagoPayPal = new PagoPayPal();
    SistemaPago nuevoSistemaPagoAdapter = new PagoNuevoSistemaAdapter();
    ServicioPagos servicioPagos = new ServicioPagos();
    // Ejecución
    servicioPagos.realizarPago(pagoTarjetaCredito, new BigDecimal(500));
    servicioPagos.realizarPago(pagoPayPal, new BigDecimal(150));
    servicioPagos.realizarPago(nuevoSistemaPagoAdapter, new BigDecimal(90));
  }
}