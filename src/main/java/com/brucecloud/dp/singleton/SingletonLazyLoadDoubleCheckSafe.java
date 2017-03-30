package com.brucecloud.dp.singleton;

/**
 * 基于volatile双重检查锁定（Double-Check Locking）单例延迟加载线程安全的.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6639672.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/30 9:55.
 *
 * @author yaoxh.
 */
public class SingletonLazyLoadDoubleCheckSafe {
    /**
     * 实例对象
     */
    private static volatile SingletonLazyLoadDoubleCheckSafe singleton;

    /**
     * 私有化构造方法, 防止外部new这个对象
     */
    private SingletonLazyLoadDoubleCheckSafe() {
    }

    /**
     * 获取单例实例
     *
     * @return 单例实例
     */
    public static SingletonLazyLoadDoubleCheckSafe getInstance() {
        if (singleton == null) {// ① 线程B恰巧执行到这里
            synchronized (SingletonLazyLoadDoubleCheckSafe.class) {
                if (singleton == null) {
                    // 这里的指令重排序被禁止了, 因为singleton是volatile的
                    // 这里有个前提条件, 需要JDK5+版本, 因为从JDK5开始使用新的JSR-133内存模型规范，这个规范增强了volatile的语义
                    singleton = new SingletonLazyLoadDoubleCheckSafe();// ② 线程A恰巧执行到这里
                }
            }
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
                SingletonLazyLoadDoubleCheckSafe singleton = SingletonLazyLoadDoubleCheckSafe.getInstance();
                singleton.print();
            }
        }.start();

        new Thread() {// 线程B
            @Override
            public void run() {
                SingletonLazyLoadDoubleCheckSafe singleton = SingletonLazyLoadDoubleCheckSafe.getInstance();
                singleton.print();
            }
        }.start();
    }
}
