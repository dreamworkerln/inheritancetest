package ru.home.inheritancetest.services.plants;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ru.home.inheritancetest.entities._base.Vehicle;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class HiTechPlantTest {

    @Autowired
    private HiTechPlant hiTechPlant;

    @Test
    void produce() {
        Vehicle vehicle = hiTechPlant.produce();
        vehicle.attack(new Object());
    }
}