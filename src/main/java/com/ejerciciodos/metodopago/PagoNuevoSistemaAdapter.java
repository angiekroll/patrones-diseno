/**
 * Copyright 2023, Company. All rights reserved Date: 6/10/23
 */
package com.ejerciciodos.metodopago;

import java.math.BigDecimal;
import java.util.UUID;

import com.ejerciciodos.metodopago.nuevosistemapago.PagoNuevoSistema;


public class PagoNuevoSistemaAdapter implements SistemaPago {

  private final PagoNuevoSistema pagoNuevoSistema = new PagoNuevoSistema();

  @Override
  public void ejecutarPago(BigDecimal monto) {
    // Utiliza el nuevo sistema de pago digital mediante adaptación
    pagoNuevoSistema.procesoPago(monto, obtenerTokenTransaccion());
  }

  private String obtenerTokenTransaccion() {
    return UUID.randomUUID().toString();
  }
}