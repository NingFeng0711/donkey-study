package com.donkey.java.io;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @version 1.0
 * @Description: IO测试类
 * @Author: lijinpeng
 * @Date: 2024/10/22 18:08
 */
public class IOTest {

    @Test
    public void test() throws IOException {
        String path = "application.properties";
        Resource resource = new ClassPathResource(path);
        try (InputStream is = resource.getInputStream()) {
            // 读取和处理资源内容
            InputStreamReader inputStreamReader = new InputStreamReader(is);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

}
