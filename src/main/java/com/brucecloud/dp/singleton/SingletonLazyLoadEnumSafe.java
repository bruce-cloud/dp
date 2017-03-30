package com.brucecloud.dp.singleton;

/**
 * 基于枚举的延迟加载 线程安全的.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6639672.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/30 15:51.
 *
 * @author yaoxh.
 */
public class SingletonLazyLoadEnumSafe {
    /**
     * 私有化构造方法, 防止外部new这个对象
     */
    private SingletonLazyLoadEnumSafe() {

    }

    /**
     * 打印方法
     */
    public void print() {
        System.out.println("楚楚街，买的漂亮~");
    }

    /**
     * 枚举类型实例持有者, 本质上跟基于类初始化的方式是一样的
     */
    public enum InstanceHolder {
        SINGLETON;
        private SingletonLazyLoadEnumSafe singleton;

        InstanceHolder() {
            singleton = new SingletonLazyLoadEnumSafe();
        }

        /**
         * 获取单例实例
         *
         * @return 单例实例
         */
        public SingletonLazyLoadEnumSafe getInstance() {
            return singleton;
        }
    }

    public static void main(String[] args) {
        new Thread() {// 线程A
            @Override
            public void run() {
                SingletonLazyLoadEnumSafe singleton = InstanceHolder.SINGLETON.getInstance();
                singleton.print();
            }
        }.start();

        new Thread() {// 线程B
            @Override
            public void run() {
                SingletonLazyLoadEnumSafe singleton = InstanceHolder.SINGLETON.getInstance();
                singleton.print();
            }
        }.start();
    }
}

