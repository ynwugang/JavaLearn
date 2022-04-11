package com.JavaSE.oop.demo09;

//抽象的思维~
/**
 * interface 定义的关键字，接口都需要实现类
 * @author wugang
 * @date 2022/4/11 20:04
 */
public interface UserService {
    //常量 public static final
    int AGE = 99;

    //接口中的所有定义其实都是抽象的public abstract
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
