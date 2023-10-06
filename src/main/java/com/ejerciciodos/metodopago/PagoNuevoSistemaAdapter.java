/**
 * Copyright 2023, Company. All rights reserved Date: 6/10/23
 */
package com.ejerciciodos.metodopago;

import java.math.BigDecimal;
import com.ejerciciodos.metodopago.nuevosistemapago.PagoNuevoSistema;

/**
 *
 * @author angiekroll@gmail.com - Ángela Carolina Castillo Rodríguez.
 * @version - 1.0.0
 * @since - 1.0.0
 */
public class PagoNuevoSistemaAdapter implements SistemaPago {
  private PagoNuevoSistema pagoNuevoSistema;

  public PagoNuevoSistemaAdapter(PagoNuevoSistema pagoNuevoSistema) {
    this.pagoNuevoSistema = pagoNuevoSistema;
  }

  @Override
  public void ejecutarPago(BigDecimal monto) {
    // Utiliza el nuevo sistema de pago digital mediante adaptación
    pagoNuevoSistema.procesoPago(monto);
  }
}