package com.example.demo.factory;

import com.example.demo.domain.Cojineria;
import com.example.demo.domain.Chasis;
import com.example.demo.domain.Motor;

public interface IAbstractFactory {
    Cojineria createCojineria();
    Chasis createChasis();
    Motor createMotor();
}
