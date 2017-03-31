package com.brucecloud.dp.factory.common;

/**
 * 通用工厂方法模式-抽象工厂类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6649986.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 10:34.
 *
 * @author yaoxh.
 */
public abstract class Factory {
    /**
     * 生产产品
     *
     * @param clazz 产品类型
     * @param <T>   泛型条件指定产品类型必须是AbstractProduct的子类
     * @return 产品
     */
    public abstract <T extends Product> T createProduct(Class<T> clazz);
}

