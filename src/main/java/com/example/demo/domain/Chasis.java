package com.example.demo.domain;

public class Chasis {
    private int numeroEjes;
    private int numeroPiezas;
    private String tipoTransmision;

    public Chasis(int numeroEjes, int numeroPiezas, String tipoTransmision) {
        this.numeroEjes = numeroEjes;
        this.numeroPiezas = numeroPiezas;
        this.tipoTransmision = tipoTransmision;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public int getNumeroPiezas() {
        return numeroPiezas;
    }

    public void setNumeroPiezas(int numeroPiezas) {
        this.numeroPiezas = numeroPiezas;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }
}
