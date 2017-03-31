package com.brucecloud.dp.factory.lazy;

import com.brucecloud.dp.factory.common.Product;
import com.brucecloud.dp.factory.common.VacuumCleaner;
import com.brucecloud.dp.factory.multi.SweepingRobot;

/**
 * 简单工厂方法模式-场景类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6649986.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 16:57.
 *
 * @author yaoxh.
 */
public class Client {
    public static void main(String[] args) {
        // 生产吸尘器
        Product vacuumCleaner1 = ProductFactory.getProduct(VacuumCleaner.class);
        Product vacuumCleaner2 = ProductFactory.getProduct(VacuumCleaner.class);
        // 生产扫地机器人
        Product sweepingRobot1 = ProductFactory.getProduct(SweepingRobot.class);
        Product sweepingRobot2 = ProductFactory.getProduct(SweepingRobot.class);

        System.out.println("是否是同一个吸尘器: " + (vacuumCleaner1 == vacuumCleaner2));
        System.out.println("是否是同一个扫地机器人: " + (sweepingRobot1 == sweepingRobot2));
    }
}