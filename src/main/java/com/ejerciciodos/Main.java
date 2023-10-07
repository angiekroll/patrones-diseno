package com.ejerciciodos;

import com.ejerciciodos.metodopago.PagoNuevoSistemaAdapter;
import com.ejerciciodos.metodopago.PagoPayPal;
import com.ejerciciodos.metodopago.PagoTarjetaCredito;
import com.ejerciciodos.metodopago.SistemaPago;
import com.ejerciciodos.metodopago.nuevosistemapago.PagoNuevoSistema;
import java.math.BigDecimal;

public class Main {

  public static void main(String[] args) {
    SistemaPago pagoTarjetaCredito = new PagoTarjetaCredito();
    SistemaPago pagoPayPal = new PagoPayPal();
    SistemaPago nuevoSistemaPagoAdapter = new PagoNuevoSistemaAdapter();

    // Ejecución
    pagoTarjetaCredito.ejecutarPago(new BigDecimal(500));
    pagoPayPal.ejecutarPago(new BigDecimal(150));
    nuevoSistemaPagoAdapter.ejecutarPago(new BigDecimal(90));
  }
}