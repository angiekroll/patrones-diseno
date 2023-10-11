package com.ejerciciouno.pedidoenlinea.model;


import com.ejerciciouno.pedidoenlinea.entities.Producto;

import java.util.List;

public class Inventario {
    private List<Producto> stockProductos;

    public Inventario(List<Producto> stockProductos) {
        this.stockProductos = stockProductos;

    }

    public int cantidadProductoIndividualEnStock(String idProducto) {
        int cantidadIndividualEnStock = 0;
        for (Producto productoIndividual : stockProductos) {
            if (idProducto.equals(productoIndividual.getId())) {
                cantidadIndividualEnStock += 1;
            }
        }
        return cantidadIndividualEnStock;
    }

    public List<Producto> getStockProductos() {
        return stockProductos;
    }
}