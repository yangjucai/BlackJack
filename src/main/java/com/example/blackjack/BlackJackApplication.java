package com.example.blackjack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BlackJackApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlackJackApplication.class, args);
    }

}
