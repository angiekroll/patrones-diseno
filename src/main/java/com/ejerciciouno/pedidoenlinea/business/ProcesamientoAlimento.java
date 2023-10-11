package com.ejerciciouno.pedidoenlinea.business;

import com.ejerciciouno.pedidoenlinea.entities.Producto;
import com.ejerciciouno.pedidoenlinea.model.Alimento;
import com.ejerciciouno.pedidoenlinea.model.Inventario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProcesamientoAlimento extends SistemaProcesamiento {
    @Override
    public boolean reciboOrdenDePedido(Producto producto, int cantidad) {
        if (0 < cantidad) {
            System.out.println("Su pedido de alimentos ha sido recibido.");
            return true;
        }
        return false;
    }

    @Override
    public boolean verificacionDeInventario(Producto producto, int cantidad, Inventario inventario) {
        if (cantidad > inventario.cantidadProductoIndividualEnStock(producto.getId())) {
            System.out.println("La cantidad de productos solicitados es mayor a la existencia en stock");
            return false;
        } else {
            System.out.println("La cantidad de productos solicitados si se encuentran en stock");
            return true;
        }
    }

    @Override
    void inspeccionElectronica(Producto producto) {

    }


    @Override
    public void validacionDeCaducidad(Alimento alimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaAlimento = LocalDate.parse(alimento.getFechaVencimiento(), formatter);
        LocalDate fechaActual = LocalDate.now();
        if (fechaActual.isBefore(fechaAlimento)) {
            System.out.println("Alimento con fecha apta para el consumo.");
        } else {
            System.out.println("Alimento con fecha no apta para el consumo.");
        }
    }

    @Override
    public void facturacion(Producto producto) {
        System.out.println("Su compra en alimentos es de: " + producto.getPrecio());
    }

    @Override
    public void embalaje() {
        System.out.println("Su producto alimenticio ha sido empacado con los estandares necesarios.");
    }

    @Override
    public void notificaAlCliente(boolean existeInventiario) {
        if (existeInventiario) {
            System.out.println("Su pedido alimenticio ha sido enviado.");
        } else {
            System.out.println("No se encuentra inventario para la cantidad de productos alimenticios seleccionados.");
        }
    }
}