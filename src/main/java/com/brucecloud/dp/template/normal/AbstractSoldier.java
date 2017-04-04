package com.brucecloud.dp.template.normal;

/**
 * 模版方法模式-士兵抽象类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6665172.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/4/4 15:50.
 *
 * @author yaoxh.
 */
public abstract class AbstractSoldier {
    /**
     * 交谈
     */
    protected abstract void talk();

    /**
     * 装备
     */
    protected abstract void equip();

    /**
     * 出击
     */
    protected abstract void attack();

    /**
     * 任务: 调用基本方法, 完成相关的逻辑
     */
    public final void task() {
        // 士兵先交谈
        talk();
        // 然后装备武器
        equip();
        // 最后出击
        attack();
    }
}