package com.shine.keepAccount;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shine.keepAccount.mapper")
public class KeepAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeepAccountApplication.class, args);
    }

}
