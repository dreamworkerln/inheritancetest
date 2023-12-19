package ru.home.inheritancetest.services.plants;

import org.springframework.stereotype.Component;
import ru.home.inheritancetest.entities.Ornitopter;
import ru.home.inheritancetest.entities._base.Vehicle;
import ru.home.inheritancetest.services.plants.base.BasePlant;

@Component
public class HiTechPlant extends BasePlant {
    @Override
    public Vehicle produce() {
        return new Ornitopter();
    }
}
