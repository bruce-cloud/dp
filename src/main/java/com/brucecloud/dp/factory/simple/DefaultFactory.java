package com.brucecloud.dp.factory.simple;

import com.brucecloud.dp.factory.common.Product;

/**
 * 简单工厂方法模式-默认工厂类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6649986.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 10:48.
 *
 * @author yaoxh.
 */
public class DefaultFactory{
    /**
     * 生产产品
     *
     * @param clazz 产品类型
     * @return 产品
     */
    public static <T extends Product> T createProduct(Class<T> clazz) {
        try {
            if (clazz != null) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }
}