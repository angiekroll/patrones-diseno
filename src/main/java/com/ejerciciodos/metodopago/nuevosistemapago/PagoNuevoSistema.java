/**
 * Copyright 2023, Company. All rights reserved Date: 6/10/23
 */
package com.ejerciciodos.metodopago.nuevosistemapago;

import java.math.BigDecimal;


public class PagoNuevoSistema {

  public void procesoPago(BigDecimal monto, String tokenId) {
    System.out.println("Pago con nuevo sistema digital: $" + monto + " con token: " + tokenId);
  }

}