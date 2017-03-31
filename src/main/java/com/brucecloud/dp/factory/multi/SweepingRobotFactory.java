package com.brucecloud.dp.factory.multi;

import com.brucecloud.dp.factory.common.Product;

/**
 * 多个工厂方法模式-扫地机器人工厂类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6649986.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 14:09.
 *
 * @author yaoxh.
 */
public class SweepingRobotFactory extends Factory{
    /**
     * 生产产品
     *
     * @return 扫地机器人产品
     */
    public Product createProduct() {
        return new SweepingRobot();
    }
}