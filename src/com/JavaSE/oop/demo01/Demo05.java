package com.JavaSE.oop.demo01;

/**
 * 引用传递：传递对象，本质还是值传递
 * @author wugang
 * @date 2022/4/10 15:25
 */
public class Demo05 {
    public static void main(String[] args) {
        //实例化一个Person对象
        Person person = new Person();
        //输出Person对象的name属性
        System.out.println(person.name);
        //调用change()方法
        Demo05.change(person);
        //再次输出Person对象的name属性
        System.out.println(person.name);
    }

    //返回值为空
    public static void change(Person person) {
        //此处person是一个对象
        person.name = "张三";
    }
}

/**
 * 定义了一个Person类，有一个name属性
 */
class Person {
    // null
    String name;
}
