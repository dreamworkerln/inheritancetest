package ru.home.inheritancetest.services.plants;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.home.inheritancetest.entities._base.Vehicle;

import static org.junit.jupiter.api.Assertions.*;

class HiTechPlantTest {

    @Autowired
    private HiTechPlant hiTechPlant;

    @Test
    void produce() {

        Vehicle vehicle = hiTechPlant.produce();
    }
}