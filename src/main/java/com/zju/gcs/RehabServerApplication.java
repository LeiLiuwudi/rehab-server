package com.zju.gcs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zju.gcs.mapper")
public class RehabServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RehabServerApplication.class, args);
    }

}
