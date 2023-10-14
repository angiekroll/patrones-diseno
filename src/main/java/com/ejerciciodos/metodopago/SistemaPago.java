/**
 * Copyright 2023. All rights reserved Date: 6/10/23
 */
package com.ejerciciodos.metodopago;

import java.math.BigDecimal;

public interface SistemaPago {
  void ejecutarPago(BigDecimal monto);

}