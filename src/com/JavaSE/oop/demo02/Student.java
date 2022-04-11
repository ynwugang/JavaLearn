package com.JavaSE.oop.demo02;

/**
 * 学生类
 * @author wugang
 * @date 2022/4/10 15:34
 */
public class Student {
    //属性：字段

    /**
     * 姓名
     * default : null
     */
    String name;

    /**
     * 年龄
     * default : 0
     */
    int age;

    //方法

    public void study(){
        System.out.println(this.name + "在学习！");
    }
}

/*
 * public static void main(String[] args) {
        //类：抽象的，需实例化
        //类实例化后会返回一个自己的对象！
        //student对象就是一个Student类地具体实例！

        Student xiaoming = new Student();
        Student xh = new Student();

        xiaoming.name = "小明";
        xiaoming.age = 3;

        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);

        xh.name = "小红";
        xh.age = 4;

        System.out.println(xh.name);
        System.out.println(xh.age);
    }
 */
