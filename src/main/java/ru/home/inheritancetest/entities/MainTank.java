package ru.home.inheritancetest.entities;

import lombok.extern.slf4j.Slf4j;
import ru.home.inheritancetest.entities._base.Vehicle;

@Slf4j
public class MainTank extends Vehicle {

    public void squashInfantry(Object o) {
        log.debug("{} squashing {}", this.getClass().getSimpleName(), o.getClass().getSimpleName());
    }
}
