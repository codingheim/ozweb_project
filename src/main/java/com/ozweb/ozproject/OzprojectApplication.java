package com.ozweb.ozproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class OzprojectApplication {

  public static void main(String[] args) {
    SpringApplication.run(OzprojectApplication.class, args);
  }

}
