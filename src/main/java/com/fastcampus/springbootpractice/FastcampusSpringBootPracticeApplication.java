package com.fastcampus.springbootpractice;

import com.fastcampus.springbootpractice.properties.MyProperties;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

@SpringBootApplication
public class FastcampusSpringBootPracticeApplication {

    private final MyProperties myProperties;

    public FastcampusSpringBootPracticeApplication(MyProperties myProperties){
        this.myProperties = myProperties;
    }

    public static void main(String[] args) {
        SpringApplication.run(FastcampusSpringBootPracticeApplication.class, args);
    }

    @PostConstruct
    public void init() {
        System.out.println("[configurationProps]" + myProperties.getHeight());
    }

}
