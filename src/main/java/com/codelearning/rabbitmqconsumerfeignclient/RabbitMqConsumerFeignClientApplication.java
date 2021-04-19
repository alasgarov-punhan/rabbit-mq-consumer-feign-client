package com.codelearning.rabbitmqconsumerfeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RabbitMqConsumerFeignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitMqConsumerFeignClientApplication.class, args);
    }

}
