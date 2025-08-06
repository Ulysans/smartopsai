package com.smartopsai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SmartOpsAiApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmartOpsAiApplication.class, args);
    }
}
