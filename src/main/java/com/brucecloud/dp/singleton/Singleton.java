package com.brucecloud.dp.singleton;

/**
 * 通用单例模式（饿汉模式）线程安全的.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6639672.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/29 22:15.
 *
 * @author yaoxh.
 */
public class Singleton {
    /**
     * 实例对象
     */
    private static final Singleton singleton = new Singleton();

    /**
     * 私有化构造方法, 防止外部new这个对象
     */
    private Singleton() {
    }

    /**
     * 获取单例实例
     *
     * @return 单例实例
     */
    public static Singleton getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        // 获取单例对象
        Singleton singleton = Singleton.getInstance();
    }
}
