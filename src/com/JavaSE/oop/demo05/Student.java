package com.JavaSE.oop.demo05;

/**
 * 学生 is 人 ： 派生类、子类
 * 子类继承了父类，就会拥有父类的全部方法！
 * <p>
 * ctrl + h
 *
 * @author wugang
 * @date 2022/4/11 14:51
 */
public class Student extends Person {
    public Student() {
        System.out.println("Student无参构造执行了");
    }

    private String name = "小张";

    public void tese(String name) {
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public void tese1() {
        print();
        this.print();
        super.print();
    }
}
