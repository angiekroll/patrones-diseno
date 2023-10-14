/**
 * Copyright 2023, Company. All rights reserved Date: 6/10/23
 */
package com.ejerciciodos.metodopago;

import java.math.BigDecimal;

public class PagoPayPal implements SistemaPago {

  @Override
  public void ejecutarPago(BigDecimal monto) {
    System.out.println("Pago con PayPal: $" + monto);
  }
}