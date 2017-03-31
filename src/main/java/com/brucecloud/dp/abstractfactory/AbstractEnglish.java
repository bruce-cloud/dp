package com.brucecloud.dp.abstractfactory;

/**
 * 抽象工厂模式-英国人抽象类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6654030.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 23:21.
 *
 * @author yaoxh.
 */
public abstract class AbstractEnglish implements Human {
    /**
     * 获取国籍
     */
    public void getCountry() {
        System.out.println("I am british...");
    }

    /**
     * 说话
     */
    public void talk() {
        System.out.println("I speak english...");
    }
}
