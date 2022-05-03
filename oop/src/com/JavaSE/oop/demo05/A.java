package com.JavaSE.oop.demo05;

/**
 * @author wugang
 * @date 2022/4/11 16:12
 */
public class A extends B{

    @Override
    public void test() {
        System.out.println("A=>tset");
    }
}

/*
        //静态的方法和非静态的方法区别很大
            //静态方法：方法的调用只和左边、定义的数据类型有关
            //非静态方法：重写
        A a = new A();
        a.test();

        //父类的引用指向了子类
        B b = new A(); //子类重写了父类的方法
        b.test();
 */