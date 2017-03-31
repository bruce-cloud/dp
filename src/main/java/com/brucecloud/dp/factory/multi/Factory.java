package com.brucecloud.dp.factory.multi;

import com.brucecloud.dp.factory.common.Product;

/**
 * 多个工厂方法模式-抽象工厂类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6649986.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 13:34.
 *
 * @author yaoxh.
 */
public abstract class Factory {
    /**
     * 生产产品
     *
     * @return 产品
     */
    public abstract Product createProduct();
}