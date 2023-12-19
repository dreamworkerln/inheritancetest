package ru.home.inheritancetest.entities;

import lombok.extern.slf4j.Slf4j;
import ru.home.inheritancetest.entities._base.Vehicle;

@Slf4j
public class Ornitopter extends Vehicle {

    public void bomb(int x, int y) {
        log.debug("{} dropping bombs at {}, {}", this.getClass().getSimpleName(), x, y);
    }

}
