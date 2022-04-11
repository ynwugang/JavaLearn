package com.JavaSE.oop.demo01;

/**
 * 值传递
 * @author wugang
 * @date 2022/4/10 15:22
 */
public class Demo04 {

    public static void main(String[] args) {
        int a = 1;

        //1
        System.out.println(a);

        Demo04.change(a);

        //1
        System.out.println(a);
    }

    //返回值为空
    public static void change(int a) {
        a = 10;
    }
}
