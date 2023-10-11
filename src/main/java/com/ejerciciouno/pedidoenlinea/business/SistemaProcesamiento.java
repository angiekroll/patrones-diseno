package com.ejerciciouno.pedidoenlinea.business;


import com.ejerciciouno.pedidoenlinea.entities.Producto;
import com.ejerciciouno.pedidoenlinea.model.Alimento;
import com.ejerciciouno.pedidoenlinea.model.Inventario;

public abstract class SistemaProcesamiento {

    public void procesamientoProducto(Producto producto, int cantidad, Inventario inventario) {
        boolean existeInventiario = false;
        reciboOrdenDePedido(producto, cantidad);
        if (verificacionDeInventario(producto, cantidad, inventario)) {
            existeInventiario = true;
            facturacion(producto);
            if ("Alimento".equals(producto.getTipo())) {
                validacionDeCaducidad((Alimento) producto);
            } else if ("Electronico".equals(producto.getTipo())) {
                inspeccionElectronica(producto);
            }
            embalaje();
        }
        notificaAlCliente(existeInventiario);
    }

    abstract boolean reciboOrdenDePedido(Producto producto, int cantidad);

    abstract boolean verificacionDeInventario(Producto producto, int cantidad, Inventario inventario);

    abstract void inspeccionElectronica(Producto producto);

    abstract void validacionDeCaducidad(Alimento alimento);

    abstract void facturacion(Producto producto);

    abstract void embalaje();

    abstract void notificaAlCliente(boolean existeInventiario);
}