package com.JavaSE.oop.demo02;

/**
 * @author wugang
 * @date 2022/4/10 15:48
 */
public class Person {
    public String name;

    // 一个类即使什么都不写，它也会存在一个默认地构造方法

    //显示的定义构造方法

    //1.使用new关键字，本质是在调用构造器
    //2.用来初始化值

    /**
     * 无参构造
     */
    public Person() {

    }

    /**
     * 有参构造
     * 一旦定义了有参构造，无参构造必须显示定义
     *
     * @param name
     */
    public Person(String name) {
        this.name = name;
    }
}

/*
    public static void main(String[] args) {
        //new 实例化一个对象
        //使用无参构造
        Person person = new Person();
        System.out.println(person.name);

        //使用有参构造
        Person person1 = new Person("张三");

        System.out.println(person1.name);
    }

    构造器：
        1.和类名相同
        2.没有返回值
    作用：
        1.new本质在调用构造方法
        2.初始化对象的值（属性）
    注意点：
        1.定义有参构造之后，如果想使用无参构造，需要显示的定义一个无参构造
 */
