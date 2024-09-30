package com.example.demo.factory;

import com.example.demo.domain.Chasis;
import com.example.demo.domain.Cojineria;
import com.example.demo.domain.Motor;

import com.example.demo.producto.cojineria.CojineriaToyota;
import com.example.demo.producto.chasis.ChasisToyota;
import com.example.demo.producto.motor.MotorToyota;

public class ToyotaFactory implements IAbstractFactory {
    @Override
    public Cojineria createCojineria() {
        return new CojineriaToyota();
    }

    @Override
    public Chasis createChasis() {
        return new ChasisToyota();
    }

    @Override
    public Motor createMotor() {
        return new MotorToyota();
    }
}