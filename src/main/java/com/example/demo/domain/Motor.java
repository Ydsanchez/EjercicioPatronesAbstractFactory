package com.example.demo.domain;

public class Motor {
    private int potenciaMaxima;
    private int numeroPiezas;
    private String tipoMotor;

    public Motor(int potenciaMaxima, int numeroPiezas, String tipoMotor) {
        this.potenciaMaxima = potenciaMaxima;
        this.numeroPiezas = numeroPiezas;
        this.tipoMotor = tipoMotor;
    }

    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    public int getNumeroPiezas() {
        return numeroPiezas;
    }

    public void setNumeroPiezas(int numeroPiezas) {
        this.numeroPiezas = numeroPiezas;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
}
