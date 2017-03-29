package com.brucecloud.dp.singleton;

/**
 * 延迟加载单例模式（懒汉模式）非线程安全的.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6639672.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/29 23:13.
 *
 * @author yaoxh.
 */
public class SingletonLazyLoadUnsafe {
    /**
     * 实例对象
     */
    private static SingletonLazyLoadUnsafe singleton;

    /**
     * 私有化构造方法, 防止外部new这个对象
     */
    private SingletonLazyLoadUnsafe() {
    }

    /**
     * 获取单例实例
     *
     * @return 单例实例
     */
    public static SingletonLazyLoadUnsafe getInstance() {
        if (singleton == null) {// ① 线程B恰巧执行到这里
            singleton = new SingletonLazyLoadUnsafe();// ② 线程A恰巧执行到这里
        }
        return singleton;
    }

    /**
     * 打印方法
     */
    public void print() {
        System.out.println("楚楚街，买的漂亮~");
    }

    public static void main(String[] args) {
        new Thread() {// 线程A
            @Override
            public void run() {
                SingletonLazyLoadUnsafe singleton = SingletonLazyLoadUnsafe.getInstance();
                singleton.print();
            }
        }.start();

        new Thread() {// 线程B
            @Override
            public void run() {
                SingletonLazyLoadUnsafe singleton = SingletonLazyLoadUnsafe.getInstance();
                singleton.print();
            }
        }.start();
    }
}
