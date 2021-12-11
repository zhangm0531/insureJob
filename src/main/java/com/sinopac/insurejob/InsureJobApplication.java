package com.sinopac.insurejob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class InsureJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(InsureJobApplication.class, args);
    }

}
