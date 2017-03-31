package com.brucecloud.dp.factory.common;

/**
 * 通用工厂方法模式-场景类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6649986.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 10:57.
 *
 * @author yaoxh.
 */
public class Client {
    public static void main(String[] args) {
        // 获得默认工厂类
        Factory factory = new DefaultFactory();
        // 生产吸尘器
        Product vacuumCleaner = factory.createProduct(VacuumCleaner.class);
        if (vacuumCleaner != null) {
            // 产品展示
            vacuumCleaner.show();
            // 产品用途
            vacuumCleaner.purpose();
        }
    }
}