package com.brucecloud.dp.template.ext;

/**
 * 模版方法模式扩展-步兵实现类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6665172.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/4/4 16:37.
 *
 * @author yaoxh.
 */
public class Infantry extends AbstractSoldier {
    public Infantry(boolean isAttack) {
        this.isAttack = isAttack;
    }

    /**
     * 默认立刻出击
     */
    private boolean isAttack = true;

    /**
     * 交谈
     */
    protected void talk() {
        System.out.println("我是步兵...");
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

    /**
     * 是否立刻出击
     *
     * @return 是/否
     */
    @Override
    protected boolean isAttack() {
        return this.isAttack;
    }
}