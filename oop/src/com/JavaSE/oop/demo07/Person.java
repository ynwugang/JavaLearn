package com.JavaSE.oop.demo07;

/**
 * @author wugang
 * @date 2022/4/11 19:38
 */
public class Person {

    {
        //代码块（匿名代码块） 可用于赋初始值
        System.out.println("匿名代码块");
    }

    static {
        //静态代码块  只执行一次
        System.out.println("静态代码块");
    }

    public Person() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("==============");
        Person person2 = new Person();
    }
}
