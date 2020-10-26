package com.iooiee;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description:
 *
 * @Author: Yanggc
 * DateTime: 10/24 11:12
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.iooiee.mappers"})
public class ApplicationStart {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class);
    }
}
