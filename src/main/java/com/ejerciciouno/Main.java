package com.ejerciciouno;


import com.ejerciciouno.pedidoenlinea.business.ProcesamientoAlimento;
import com.ejerciciouno.pedidoenlinea.business.ProcesamientoElectronico;
import com.ejerciciouno.pedidoenlinea.business.ProcesamientoRopa;
import com.ejerciciouno.pedidoenlinea.business.SistemaProcesamiento;
import com.ejerciciouno.pedidoenlinea.entities.Producto;
import com.ejerciciouno.pedidoenlinea.model.Alimento;
import com.ejerciciouno.pedidoenlinea.model.Electronico;
import com.ejerciciouno.pedidoenlinea.model.Inventario;
import com.ejerciciouno.pedidoenlinea.model.Ropa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Producto> productosAlimentos = new ArrayList<>();
        productosAlimentos.add(new Alimento("1", "Galletas", 1500, "Oreo", "Alimento", "01-12-2030"));
        productosAlimentos.add(new Alimento("2", "Gomitas", 500, "Trululu", "Alimento", "01-12-2023"));
        productosAlimentos.add(new Alimento("3", "Gaseosa", 2500, "Pepsi", "Alimento", "01-12-2022"));
        Inventario inventarioAlimentos = new Inventario(productosAlimentos);

        List<Producto> productosElectronicos = new ArrayList<>();
        productosElectronicos.add(new Electronico("4", "Lavadora", 1200000, "Whirlpool", "Electronico", "A"));
        productosElectronicos.add(new Electronico("5", "Calentador", 300000, "Rheem", "Electronico", "B"));
        productosElectronicos.add(new Electronico("6", "Televisor", 6000000, "Samsung", "Electronico", "C"));
        Inventario inventarioElectronicos = new Inventario(productosElectronicos);

        List<Producto> productosRopa = new ArrayList<>();
        productosRopa.add(new Ropa("7", "Zapatos", 56000, "Le coq sportif", "Ropa", "S"));
        productosRopa.add(new Ropa("8", "Sudadera", 150000, "Adidas", "Ropa", "M"));
        productosRopa.add(new Ropa("9", "Gorra", 60000, "Lacoste", "Ropa", "L"));
        Inventario inventarioRopa = new Inventario(productosRopa);

        System.out.println("\n*********** Procesamiento Alimentos ***********");
        Producto productoAComprarAlimentos = new Alimento("1", "Galletas", 1500, "Oreo", "Alimento", "01-12-2030");
        SistemaProcesamiento sistemaProcesamientoAlimento
                = new ProcesamientoAlimento();
        sistemaProcesamientoAlimento.procesamientoProducto(productoAComprarAlimentos, 1, inventarioAlimentos);

        System.out.println("\n*********** Procesamiento Ropa ***********");
        Producto productoAComprarRopa = new Ropa("9", "Gorra", 60000, "Lacoste", "Ropa", "L");
        SistemaProcesamiento sistemaProcesamientoRopa
                = new ProcesamientoRopa();
        sistemaProcesamientoRopa.procesamientoProducto(productoAComprarRopa, 8, inventarioRopa);

        System.out.println("\n*********** Procesamiento Electronico ***********");
        Producto productoAComprarElectrodomesticos = new Electronico("4", "Lavadora", 1200000, "Whirlpool", "Electronico", "A");
        SistemaProcesamiento sistemaProcesamientoElectrodomesticos
                = new ProcesamientoElectronico();
        sistemaProcesamientoElectrodomesticos.procesamientoProducto(productoAComprarElectrodomesticos, 8, inventarioElectronicos);

    }
}
