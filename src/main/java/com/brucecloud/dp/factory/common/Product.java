package com.brucecloud.dp.factory.common;

/**
 * 通用工厂方法模式-抽象产品类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6649986.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 10:36.
 *
 * @author yaoxh.
 */
public abstract class Product {
    /**
     * 产品类公共方法, 说明自己是一款产品
     */
    public void show() {
        System.out.println("我是一款产品...");
    }

    /**
     * 抽象方法, 说明自己的用途
     */
    public abstract void purpose();
}