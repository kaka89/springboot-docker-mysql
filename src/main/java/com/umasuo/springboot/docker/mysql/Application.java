package com.umasuo.springboot.docker.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author bruceliu
 * @date 2016-10-02
 */
@SpringBootApplication
@ComponentScan("com.umasuo.springboot")
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
