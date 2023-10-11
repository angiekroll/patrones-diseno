package com.ejerciciouno.pedidoenlinea.entities;

public class Producto {

    private String id;
    private String nombre;
    private int precio;
    private String marca;
    private String tipo;

    public Producto(String id, String nombre, int precio, String marca, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }
}