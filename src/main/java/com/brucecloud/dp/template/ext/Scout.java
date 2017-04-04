package com.brucecloud.dp.template.ext;

/**
 * 模版方法模式扩展-侦察兵实现类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6665172.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/4/4 16:42.
 *
 * @author yaoxh.
 */
public class Scout extends AbstractSoldier {
    /**
     * 交谈
     */
    protected void talk() {
        System.out.println("我是侦察兵...");
    }

    /**
     * 装备
     */
    protected void equip() {
        System.out.println("我已整装待发...");
    }

    /**
     * 出击
     */
    protected void attack() {
        System.out.println("开始出击...");
    }
}