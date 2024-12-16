package com.donkey.mybatisPlus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description: TODO
 * @Author: 李金澎
 * @Date: 2024/7/19 09:58
 * @Version: 1.0
 **/
@SpringBootApplication
//@ComponentScan(basePackages = {"com.donkey.**"})
public class MybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class,args);
    }

}
