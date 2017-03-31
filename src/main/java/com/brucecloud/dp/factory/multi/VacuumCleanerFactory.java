package com.brucecloud.dp.factory.multi;

import com.brucecloud.dp.factory.common.Product;
import com.brucecloud.dp.factory.common.VacuumCleaner;

/**
 * 多个工厂方法模式-吸尘器工厂类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6649986.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 14:08.
 *
 * @author yaoxh.
 */
public class VacuumCleanerFactory extends Factory{
    /**
     * 生产产品
     *
     * @return 吸尘器产品
     */
    public Product createProduct() {
        return new VacuumCleaner();
    }
}