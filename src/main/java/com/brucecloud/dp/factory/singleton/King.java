package com.brucecloud.dp.factory.singleton;

/**
 * 单例工厂方法模式-国王类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6649986.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 14:44.
 *
 * @author yaoxh.
 */
public class King {
    /**
     * 私有化国王的构造方法, 使其无法被new出对象
     */
    private King() {

    }

    /**
     * 国王说话
     */
    public void say() {
        System.out.println("我是这个国家的主宰...");
    }
}