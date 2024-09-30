package com.example.demo.factory;

import com.example.demo.domain.Chasis;
import com.example.demo.domain.Cojineria;
import com.example.demo.domain.Motor;

import com.example.demo.producto.cojineria.CojineriaFord;
import com.example.demo.producto.chasis.ChasisFord;
import com.example.demo.producto.motor.MotorFord;

public class FordFactory implements IAbstractFactory {
    @Override
    public Cojineria createCojineria() {return new CojineriaFord();}

    @Override
    public Chasis createChasis() {
        return new ChasisFord();
    }

    @Override
    public Motor createMotor() {
        return new MotorFord();
    }
}