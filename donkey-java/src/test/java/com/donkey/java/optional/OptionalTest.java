package com.donkey.java.optional;

import com.donkey.java.entity.OptionalObject;
import com.donkey.java.entity.ReflectionObject;
import org.junit.Test;

import java.util.Optional;

/**
 * @version 1.0
 * @Description: 非空对象
 * @Author: lijinpeng
 * @Date: 2024/11/15 16:46
 */
public class OptionalTest {

    @Test
    public void test1() {
        OptionalObject object1 = null;
        OptionalObject object2 = new OptionalObject();

        Optional<OptionalObject> object3 = Optional.ofNullable(object1);
        // 空指针
//        Optional<ReflectionObject> object4 = Optional.of(object1);
        Optional<OptionalObject> object4 = Optional.of(object2);
        Optional<OptionalObject> object5 = Optional.empty();

        System.out.println(object3.isPresent());// false
        System.out.println(object4.isPresent());// true

//        System.out.println(object3.get()); //java.util.NoSuchElementException: No value present
        System.out.println(object4.get());//OptionalObject(id=null, name=null)
//        System.out.println(object3.orElseThrow(RuntimeException::new)); //java.lang.RuntimeException
        System.out.println(object3.orElse(new OptionalObject("1","2"))); //OptionalObject(id=1, name=2)
//        System.out.println(object3.orElseGet());
//        System.out.println(object5.orElseThrow(() -> new RuntimeException("失败")));// RuntimeException 失败
        System.out.println(object5.get());

    }

}
