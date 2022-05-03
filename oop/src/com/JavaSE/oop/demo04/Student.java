package com.JavaSE.oop.demo04;

/**
 * 封装
 * 1.提高程序的安全性，保护数据
 * 2.隐藏代码的实现细节
 * 3.统一接口
 * 4.增加系统可维护性
 * @author wugang
 * @date 2022/4/11 14:26
 */
public class Student  {
    //属性私有
    /**
     * 名字
     */
    private String name;
    /**
     * 学号
     */
    private int id;
    /**
     * 性别
     */
    private char sex;
    /**
     * 年龄
     */
    private int age;

    //提供一些可以操作这个属性的方法
    //提供一些public的get、set方法

    //get 获得这个暑假
    public String getName() {
        return name;
    }
    //set 给这个数据赋值
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 120 || age < 0){
            this.age = 3;
        }else {
            this.age = age;
        }
    }
}

/*
    Student s1 = new Student();

    s1.setName("张三");

    System.out.println(s1.getName());
 */
