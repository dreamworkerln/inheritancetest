package ru.home.inheritancetest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;

@Slf4j
public class ApplicationStartupRunner implements ApplicationRunner {

    @Autowired
    private Environment env;

    @Override
    public void run(ApplicationArguments args) {
    }
}
