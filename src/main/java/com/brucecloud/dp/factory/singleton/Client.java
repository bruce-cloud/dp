package com.brucecloud.dp.factory.singleton;

/**
 * 单例工厂方法模式-场景类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6649986.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 13:57.
 *
 * @author yaoxh.
 */
public class Client {
    public static void main(String[] args) {
        // 获取国王
        King king = SingletonFactory.getKing();
        if (king != null) {
            // 国王说话
            king.say();
        }
    }
}