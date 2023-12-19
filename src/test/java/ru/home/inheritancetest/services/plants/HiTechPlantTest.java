package ru.home.inheritancetest.services.plants;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ru.home.inheritancetest.entities.Ornitopter;
import ru.home.inheritancetest.entities._base.Vehicle;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@Slf4j
class HiTechPlantTest {

    @Autowired
    private HiTechPlant hiTechPlant;

  
    @Test
    void produce() {
        Vehicle vehicle = hiTechPlant.produce();
        vehicle.status();

        //ToDo: remove casting hiTechPlant.produce() to Ornitopter
        Ornitopter ornitopter = (Ornitopter)hiTechPlant.produce();
        ornitopter.bomb(5, 37);
    }
}