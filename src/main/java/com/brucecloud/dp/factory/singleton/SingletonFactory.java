package com.brucecloud.dp.factory.singleton;

import java.lang.reflect.Constructor;

/**
 * 单例工厂方法模式-单例工厂类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6649986.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 14:42.
 *
 * @author yaoxh.
 */
@SuppressWarnings("unchecked")
public class SingletonFactory {
    /**
     * 单例国王对象
     */
    private static King king;

    static {
        try {
            Class clazz = Class.forName(King.class.getName());
            Constructor constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            king = (King) constructor.newInstance();
        } catch (Exception e) {
            System.out.println("创建国王失败了...");
        }
    }

    /**
     * 获取国王
     *
     * @return 国王
     */
    public static King getKing() {
        return king;
    }
}