/**
 * Copyright 2023, Company. All rights reserved Date: 6/10/23
 */
package com.ejerciciodos.metodopago;

import java.math.BigDecimal;

/**
 *
 * @author angiekroll@gmail.com - Ángela Carolina Castillo Rodríguez.
 * @version - 1.0.0
 * @since - 1.0.0
 */
public class PagoPayPal implements SistemaPago {

  @Override
  public void ejecutarPago(BigDecimal monto) {
    System.out.println("Pago con PayPal: $" + monto);
  }
}