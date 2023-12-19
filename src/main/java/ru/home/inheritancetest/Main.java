package ru.home.inheritancetest;

import ru.home.inheritancetest.entities.Ornitopter;
import ru.home.inheritancetest.entities._base.Vehicle;
import ru.home.inheritancetest.services.plants.HiTechPlant;

public class Main {

    public static void main(String[] args) {

        HiTechPlant hiTechPlant = new HiTechPlant();

        Vehicle vehicle = hiTechPlant.produce();
        vehicle.status();

        //ToDo: remove casting hiTechPlant.produce() to Ornitopter
        Ornitopter ornitopter = (Ornitopter)hiTechPlant.produce();
        ornitopter.bomb(5, 37);


    }
}
