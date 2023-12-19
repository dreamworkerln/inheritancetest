package ru.home.inheritancetest.entities._base;

import lombok.extern.slf4j.Slf4j;



@Slf4j
public class Vehicle {

    public void move(int x, int y) {
        log.debug("{} moving to {}, {}", this.getClass().getSimpleName(), x, y);
    }

    public void attack(Object o) {
        log.debug("{} attacking {}", this.getClass().getSimpleName(), o.getClass().getSimpleName());
    }

    public void status() {
        log.debug("{} awaiting orders", this.getClass().getSimpleName());
    }
}
