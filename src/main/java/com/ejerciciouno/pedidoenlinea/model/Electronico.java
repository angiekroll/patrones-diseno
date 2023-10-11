package com.ejerciciouno.pedidoenlinea.model;


import com.ejerciciouno.pedidoenlinea.entities.Producto;

public class Electronico extends Producto {

    public Electronico(String id, String nombre, int precio, String marca, String tipo, String eficienciaEnergetica) {
        super(id, nombre, precio, marca, tipo);
    }
}