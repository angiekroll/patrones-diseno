package com.ejerciciouno.pedidoenlinea.business;


import com.ejerciciouno.pedidoenlinea.entities.Producto;
import com.ejerciciouno.pedidoenlinea.model.Alimento;
import com.ejerciciouno.pedidoenlinea.model.Inventario;

public class ProcesamientoElectronico extends SistemaProcesamiento {
    @Override
    public boolean reciboOrdenDePedido(Producto producto, int cantidad) {
        if (0 < cantidad) {
            System.out.println("Su pedido de productos electronicos ha sido recibido.");
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
    public void inspeccionElectronica(Producto producto) {
        System.out.println("Su producto electronico ha sido inspeccionado.");
    }

    @Override
    public void validacionDeCaducidad(Alimento alimento) {
    }

    public void facturacion(Producto producto) {
        System.out.println("Su compra en productos electronicos es de: " + producto.getPrecio());
    }

    @Override
    public void embalaje() {
        System.out.println("Su pedido electronico ha sido empacado con los estandares necesarios.");
    }

    @Override
    public void notificaAlCliente(boolean existeInventiario) {
        if (existeInventiario) {
            System.out.println("Su pedido electronico ha sido enviado.");
        } else {
            System.out.println("No se encuentra inventario para la cantidad de productos electronicos seleccionados.");
        }
    }
}