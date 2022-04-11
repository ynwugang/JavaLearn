package com.JavaSE.oop.demo01;

/**
 * 静态方法和非静态方法
 * @author wugang
 * @date 2022/4/10 14:51
 */
public class Demo02 {

    public static void main(String[] args) {
        //静态方法 static 直接使用类名.方法名调用
        Student.say();

        //非静态方法 需要先实例化对象(new)后才能调用
        //Student.say1();
        Student student = new Student();
        student.say1();
    }

    //静态方法
    //和类一起加载的
    public static void a() {
        //b();
    }

    //非静态方法
    //类实例化之后才存在
    public void b() {

    }
}
