package com.example.demo.model;

import com.example.demo.domain.Cojineria;
import com.example.demo.domain.Motor;
import com.example.demo.domain.Chasis;

public class Vehiculo {

    private String marca;
    private String colorVehiculo;
    private String fechaEnsamblaje;
    private String numEnsamblaje;
    private Cojineria cojineria;
    private Motor motor;
    private Chasis chasis;

    public Vehiculo(String marca, String colorVehiculo, String fechaEnsamblaje, String numEnsamblaje, Cojineria cojineria, Motor motor, Chasis chasis) {
        this.marca = marca;
        this.colorVehiculo = colorVehiculo;
        this.fechaEnsamblaje = fechaEnsamblaje;
        this.numEnsamblaje = numEnsamblaje;
        this.cojineria = cojineria;
        this.motor = motor;
        this.chasis = chasis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColorVehiculo() {
        return colorVehiculo;
    }

    public void setColorVehiculo(String colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }

    public String getFechaEnsamblaje() {
        return fechaEnsamblaje;
    }

    public void setFechaEnsamblaje(String fechaEnsamblaje) {
        this.fechaEnsamblaje = fechaEnsamblaje;
    }

    public String getNumEnsamblaje() {
        return numEnsamblaje;
    }

    public void setNumEnsamblaje(String numEnsamblaje) {
        this.numEnsamblaje = numEnsamblaje;
    }

    public Cojineria getCojineria() {
        return cojineria;
    }

    public void setCojineria(Cojineria cojineria) {
        this.cojineria = cojineria;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }
}
