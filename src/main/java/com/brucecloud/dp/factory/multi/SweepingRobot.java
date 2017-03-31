package com.brucecloud.dp.factory.multi;

import com.brucecloud.dp.factory.common.Product;

/**
 * 通用工厂方法模式-扫地机器人.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6649986.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 14:10.
 *
 * @author yaoxh.
 */
public class SweepingRobot extends Product {
    /**
     * 说明自己的用途
     */
    public void purpose() {
        System.out.println("我可以扫地...");
    }
}