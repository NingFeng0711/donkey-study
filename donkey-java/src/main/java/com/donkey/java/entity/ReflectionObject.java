package com.donkey.java.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @Description: 反射测试类
 * @Author: lijinpeng
 * @Date: 2024/10/30 17:13
 */
@Data
@Component
public class ReflectionObject {

    private String value;

    public String name;

    public ReflectionObject() {
        value = "小驴来了";
    }

    public void publicMethod(String s) {
        System.out.println("I love " + s);
    }

    private void privateMethod() {
        System.out.println("value is " + value);
    }

}
