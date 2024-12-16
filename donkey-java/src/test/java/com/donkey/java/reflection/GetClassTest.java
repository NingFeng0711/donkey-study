package com.donkey.java.reflection;

import com.donkey.common.entity.Student;
import org.junit.Test;

/**
 * @version 1.0
 * @Description: 获取Class对象的四种方式
 * @Author: lijinpeng
 * @Date: 2024/10/30 16:30
 */
public class GetClassTest {

    /*
     * @Description 从具体的类获取
     * @author lijinpeng
     * @date 2024/10/30 16:36
     */
    @Test
    public void test1() {
        Class<Student> c = Student.class;
        System.out.println(c);
    }

    /*
     * @Description 从类路径中获取
     * @author lijinpeng
     * @date 2024/10/30 16:36
     */
    @Test
    public void test2() throws ClassNotFoundException {
        Class<?> c = Class.forName("com.donkey.common.entity.Student");
        System.out.println(c);
    }

    /*
     * @Description 从实例对象中获取
     * @author lijinpeng
     * @date 2024/10/30 16:36
     */
    @Test
    public void test3() {
        Student s = new Student();
        Class<? extends Student> aClass = s.getClass();
        System.out.println(aClass);
    }

    @Test
    public void test4() throws ClassNotFoundException {
        // 第一种
//        Class<?> aClass = GetClassTest.class.getClassLoader().loadClass("com.donkey.common.entity.Student");
        // 第二种
//        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
//        Class<?> aClass = classLoader.loadClass("com.donkey.common.entity.Student");
        // 第三种
        Class<?> aClass = ClassLoader.getSystemClassLoader().loadClass("com.donkey.common.entity.Student");
        System.out.println(aClass);
    }


}
