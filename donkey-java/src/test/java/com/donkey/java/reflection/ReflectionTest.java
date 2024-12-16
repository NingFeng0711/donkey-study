package com.donkey.java.reflection;

import org.junit.Test;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @version 1.0
 * @Description: 反射
 * @Author: lijinpeng
 * @Date: 2024/10/30 16:39
 */
public class ReflectionTest {

    /*
        通过类加载器获取 Class 对象不会进行初始化，意味着不进行包括初始化等一系列步骤，静态代码块和静态对象不会得到执行
     */

    /*
     * @Description 获取属性 方法
     * @author lijinpeng
     * @date 2024/10/30 17:25
     */
    @Test
    public void test() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName("com.donkey.java.entity.ReflectionObject");

        // 获取所有public的属性
        Field[] fields = aClass.getFields();
        System.out.println(Arrays.toString(fields));

        // 获取所有属性 包括private
        Field[] declaredFields = aClass.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));

        // 生成实际的对象
        Object o = aClass.newInstance();

        // 获取所有注解
        Component annotation = aClass.getAnnotation(Component.class);
        System.out.println(annotation);
        Annotation[] annotations = aClass.getAnnotations();
        System.out.println(Arrays.toString(annotations));

        // 私有方法操作
        Method privateMethod = aClass.getDeclaredMethod("privateMethod");
        System.out.println(privateMethod);
        privateMethod.setAccessible(true);
        Object invoke = privateMethod.invoke(o);

        // 公有传参操作
        Method publicMethod = aClass.getMethod("publicMethod", String.class);
        Object invoke1 = publicMethod.invoke(o, "小驴来了");
        System.out.println(publicMethod);
    }

}
