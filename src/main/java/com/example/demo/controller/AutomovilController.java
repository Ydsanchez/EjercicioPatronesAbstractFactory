package com.example.demo.controller;

import com.example.demo.model.Vehiculo;
import com.example.demo.factory.FordFactory;
import com.example.demo.factory.IAbstractFactory;
import com.example.demo.factory.MazdaFactory;
import com.example.demo.factory.ToyotaFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehiculo")
public class AutomovilController {

    @GetMapping("/ensamblar/{marca}")
    public Vehiculo ensamblarAutomovil(@PathVariable String marca){

        IAbstractFactory factory;
        switch (marca.toLowerCase()) {
            case "toyota":
                factory = new ToyotaFactory();
                break;
            case "ford":
                factory = new FordFactory();
                break;
            case "mazda":
                factory = new MazdaFactory();
                break;
            default: throw new IllegalArgumentException("Marca no soportada");
        }

        Vehiculo vehiculo = new Vehiculo(
                marca,
                "Rojo",
                "23/12/2024",
                "1003",
                factory.createCojineria(),
                factory.createMotor(),
                factory.createChasis()
        );

        return vehiculo;
    }
}