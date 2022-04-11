package com.JavaSE.oop.demo03;

/**
 * @author wugang
 * @date 2022/4/10 16:06
 */
public class Pet {
    public String name;
    public int age;

    //无参构造

    public void shout(){
        System.out.println("叫了一声！");
    }
}


/*
        /*
        1.类与对象
            类是一个模板：抽象，对象是一个具体的实例
        2.方法
            定义、调用
        3.对象的引用
            引用类型：基本类型(8)
            对象是通过引用来操作的：栈--->堆
        4.属性：字段Field 成员变量
            默认初始化：
                数字：0  0.0
                char：u0000
                boolean：false
                引用：null
         5.对象的创建和使用
            - 必须使用new关键字创造对象，构造器 Person zhangs = new Person();
            - 对象的属性 zhangs.name;
            - 对象的方法 zhangs.sleep();

         6.类
            静态的属性 属性
            动态的行为 方法
         */

    /*
    Pet dog = new Pet();
    dog.name = "旺财";
    dog.age = 5;
    dog.shout();

    System.out.println(dog.name);
    System.out.println(dog.age);
 */
