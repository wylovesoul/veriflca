package com.ywb.verification;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.ywb.verification.mapper")
@SpringBootApplication
public class VerificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(VerificationApplication.class, args);
    }

}
