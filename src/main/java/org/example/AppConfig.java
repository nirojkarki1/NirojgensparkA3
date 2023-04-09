package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration// Says that this class contains the beans.
@ComponentScan(basePackages = "org.example")
public class AppConfig {
//    @Bean
//    public student getStudent(){
//        return new student();
//    }
//    @Bean
//    public Address getAddress(){
//        return new Address();
//    }
//    @Bean
//    public phone getphone(){
//        return new phone();
//    }
}
