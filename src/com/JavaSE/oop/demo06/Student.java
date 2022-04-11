package com.JavaSE.oop.demo06;

/**
 * @author wugang
 * @date 2022/4/11 16:30
 */
public class Student extends Person {
    public void go() {
        System.out.println("go");
    }
}

/*
        //Object > String
        //Object > Person > Teacher
        //Object > Person > Student
        Object object = new Student();

        //System.out.println(X instanceof Y);//编译能不能通过！

        System.out.println(object instanceof Student);//true
        System.out.println(object instanceof Person);//true
        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof Teacher);//false
        System.out.println(object instanceof String);//false

        System.out.println("========================");

        Person person = new Student();

        System.out.println(person instanceof Student);//true
        System.out.println(person instanceof Person);//true
        System.out.println(person instanceof Object);//true
        System.out.println(person instanceof Teacher);//false
        //System.out.println(person instanceof String);//编译报错

        System.out.println("========================");

        Student student = new Student();

        System.out.println(student instanceof Student);//true
        System.out.println(student instanceof Person);//true
        System.out.println(student instanceof Object);//true
        //System.out.println(student instanceof Teacher);//编译报错
        //System.out.println(student instanceof String);//编译报错
 */

/*
        //类型之间的转换：父  子

        //高                  低
        Person obj = new Student();

        //student将这个对象转换为Student类型，就可以使用Student类型的方法了！
        ((Student) obj).go();

        //子类转换为父类，可能丢失自己本来的一些方法！
        Student student = new Student();
        student.go();
        Person person = student;
 */

/*
    1.父类引用指向子类的对象
    2.子类转换为父类，向上转型；
    3.父类转换为子类，向下转型；强制转换
    4.方便方法的调用，减少重复的代码！简介
 */