package com.brucecloud.dp.singleton;

/**
 * 基于类初始化的延迟加载（Initialization on Demand Holder 即IoDH）线程安全的.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6639672.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/30 14:31.
 *
 * @author yaoxh.
 */
public class SingletonLazyLoadIoDHSafe {
    /**
     * 私有化构造方法, 防止外部new这个对象
     */
    private SingletonLazyLoadIoDHSafe() {

    }

    /**
     * 内部静态类, 单例对象持有者
     */
    private static class InstanceHolder {
        public static SingletonLazyLoadIoDHSafe singleton = new SingletonLazyLoadIoDHSafe();
    }

    /**
     * 获取单例实例
     *
     * @return 单例实例
     */
    public static SingletonLazyLoadIoDHSafe getInstance() {
        return InstanceHolder.singleton;
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
                SingletonLazyLoadIoDHSafe singleton = SingletonLazyLoadIoDHSafe.getInstance();
                singleton.print();
            }
        }.start();

        new Thread() {// 线程B
            @Override
            public void run() {
                SingletonLazyLoadIoDHSafe singleton = SingletonLazyLoadIoDHSafe.getInstance();
                singleton.print();
            }
        }.start();
    }
}

