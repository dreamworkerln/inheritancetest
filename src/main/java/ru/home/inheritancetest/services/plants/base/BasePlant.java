package ru.home.inheritancetest.services.plants.base;

import lombok.Getter;
import ru.home.inheritancetest.entities._base.Vehicle;

public abstract class BasePlant {

    @Getter
    private int hp;

    public abstract Vehicle produce();

    public void repair() {
        hp += 10;
    }

}
