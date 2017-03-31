package com.brucecloud.dp.factory.multi;

import com.brucecloud.dp.factory.common.Product;

/**
 * 多个工厂方法模式-场景类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6649986.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 13:57.
 *
 * @author yaoxh.
 */
public class Client {
    public static void main(String[] args) {
        // 生产吸尘器
        Product vacuumCleaner = new VacuumCleanerFactory().createProduct();
        // 生产扫地机器人
        Product sweepingRobot = new SweepingRobotFactory().createProduct();

        if (vacuumCleaner != null) {
            // 产品展示
            vacuumCleaner.show();
            // 产品用途
            vacuumCleaner.purpose();
        }

        if (sweepingRobot != null) {
            // 产品展示
            sweepingRobot.show();
            // 产品用途
            sweepingRobot.purpose();
        }
    }
}