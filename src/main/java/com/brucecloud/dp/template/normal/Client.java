package com.brucecloud.dp.template.normal;

/**
 * 模版方法模式-场景模拟类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6665172.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/4/4 16:44.
 *
 * @author yaoxh.
 */
public class Client {
    public static void main(String[] args) {
        AbstractSoldier infantry = new Infantry();
        AbstractSoldier scout = new Scout();
        System.out.println("=======生产步兵=======");
        infantry.task();
        System.out.println("=======生产侦察兵=======");
        scout.task();
    }
}