package com.example.demo.factory;

import com.example.demo.domain.Chasis;
import com.example.demo.domain.Cojineria;
import com.example.demo.domain.Motor;

import com.example.demo.producto.cojineria.CojineriaMazda;
import com.example.demo.producto.chasis.ChasisMazda;
import com.example.demo.producto.motor.MotorMazda;

public class MazdaFactory implements IAbstractFactory {
    @Override
    public Cojineria createCojineria() {
        return new CojineriaMazda();
    }

    @Override
    public Chasis createChasis() {
        return new ChasisMazda();
    }

    @Override
    public Motor createMotor() {
        return new MotorMazda();
    }
}