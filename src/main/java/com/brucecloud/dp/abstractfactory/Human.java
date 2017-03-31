package com.brucecloud.dp.abstractfactory;

/**
 * 抽象工厂模式-人类接口.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6654030.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 23:04.
 *
 * @author yaoxh.
 */
public interface Human {
    /**
     * 获取国籍
     */
    void getCountry();

    /**
     * 说话
     */
    void talk();

    /**
     * 获取性别
     */
    void getSex();
}
