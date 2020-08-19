package com.example.loginsocialfbgoogle;

import com.example.loginsocialfbgoogle.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class LoginsocialfbgoogleApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginsocialfbgoogleApplication.class, args);
    }

}
