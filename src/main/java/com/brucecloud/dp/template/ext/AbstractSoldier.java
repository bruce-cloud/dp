package com.brucecloud.dp.template.ext;

/**
 * 模版方法模式扩展-士兵抽象类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6665172.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/4/4 20:50.
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
     * 是否立刻出击
     *
     * @return 是/否
     */
    protected boolean isAttack() {
        return true;
    }

    /**
     * 任务: 调用基本方法, 完成相关的逻辑
     */
    public final void task() {
        // 士兵先交谈
        talk();
        // 然后装备武器
        equip();
        if(isAttack()){
            // 最后出击
            attack();
        }else{
            System.out.println("等待出击命令...");
        }
    }
}