package com.example.demo.domain;

public class Cojineria {
    private int numeroPiezas;
    private String materialFabricacion;

    public Cojineria(int numeroPiezas, String materialFabricacion) {
        this.numeroPiezas = numeroPiezas;
        this.materialFabricacion = materialFabricacion;
    }

    public int getNumeroPiezas() {
        return numeroPiezas;
    }

    public void setNumeroPiezas(int numeroPiezas) {
        this.numeroPiezas = numeroPiezas;
    }

    public String getMaterialFabricacion() {
        return materialFabricacion;
    }

    public void setMaterialFabricacion(String materialFabricacion) {
        this.materialFabricacion = materialFabricacion;
    }
}
