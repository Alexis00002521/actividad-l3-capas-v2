package com.ncapas.actividadl3capasv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.ncapas.Entities"})
public class ActividadL3CapasVApplication {
    public static void main(String[] args) {
        SpringApplication.run(ActividadL3CapasVApplication.class, args);
    }

}
