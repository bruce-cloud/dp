package com.brucecloud.dp.factory.lazy;

import com.brucecloud.dp.factory.common.Product;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 延迟初始化工厂方法模式-产品工厂类 线程安全的.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6649986.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 16:25.
 *
 * @author yaoxh.
 */
public class ProductFactory {
    /**
     * 产品类合集
     */
    private static final Map<Class<?>, Product> productMap = new ConcurrentHashMap<>();

    /**
     * 获取单例产品
     *
     * @param clazz 产品类型
     * @return 单例产品
     */
    public static Product getProduct(Class<? extends Product> clazz) {
        try {
            if (!productMap.containsKey(clazz)) {
                productMap.putIfAbsent(clazz, clazz.newInstance());
            }
            return productMap.get(clazz);
        } catch (Exception e) {
            System.out.println("获取产品失败...");
        }
        return null;
    }
}