package com.brucecloud.dp.factory.common;

/**
 * 通用工厂方法模式-吸尘器.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6649986.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 10:45.
 *
 * @author yaoxh.
 */
public class VacuumCleaner extends Product {
    /**
     * 说明自己的用途
     */
    public void purpose() {
        System.out.println("我可以清洁地毯...");
    }
}