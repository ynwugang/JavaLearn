package com.JavaSE.oop.demo05;

/**
 * Person 人：父类、基类
 * 在Java中，所有的类都默认直接或间接继承Object类
 * @author wugang
 * @date 2022/4/11 14:50
 */
public class Person {
    public Person() {
        //隐藏代码：调用了父类的无参构造
        super();//调用父类的构造器，必须要在子类构造器的第一行
        System.out.println("Person无参构造执行了");
    }

    protected String name = "张三";

    //私有的东西无法被继承

    public void print(){
        System.out.println("Person");
    }
}
