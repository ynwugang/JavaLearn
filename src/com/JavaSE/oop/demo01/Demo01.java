package com.JavaSE.oop.demo01;

import java.io.IOException;

/**
 * 方法地定义
 * @author wugang
 * @date 2022/4/10 14:40
 */
public class Demo01 {
    public static void main(String[] args) {

    }

    /**
     * 修饰符 返回值类型 方法名(...){
     * //方法体
     * return 返回值；
     * }
     *
     * @return
     */
    public String sayHello() {
        return "hello,world!";
    }

    public void print() {
        return;
    }

    public int max(int a, int b) {
        //三元运算符
        return a > b ? a : b;
    }

    public void readFile(String file) throws IOException {

    }
}
