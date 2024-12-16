package com.donkey.java.stream;

import com.donkey.common.entity.Student;
import com.donkey.java.entity.OptionalObject;
import org.springframework.beans.BeanUtils;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class StreamDemo {

    public static void main(String[] args) {



    }

    private static void addListData(List<Student> studentList) {

        for (int i = 1; i <= 100; i++) {
            String namePrefix = "张";
            String nameSuffix = String.valueOf(i);
            String name = namePrefix + nameSuffix;
            int age = 20 + i % 10;
            studentList.add(Student.builder()
                    .id((long) i)
                    .name(name)
                    .age(age)
                    .build());
        }

    }


}
