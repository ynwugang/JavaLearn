package com.JavaSE.oop.demo01;

/**
 *形参和实参
 * @author wugang
 * @date 2022/4/10 15:17
 */
public class Demo03 {

    public static void main(String[] args) {
        //实际参数和形式参数地类型要对应！
        int add = Demo03.add(1,2);
        System.out.println(add);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
