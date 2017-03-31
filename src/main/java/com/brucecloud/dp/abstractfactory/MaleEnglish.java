package com.brucecloud.dp.abstractfactory;

/**
 * 抽象工厂模式-英国男人实现类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6654030.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 23:26.
 *
 * @author yaoxh.
 */
public class MaleEnglish extends AbstractEnglish {
    /**
     * 获取性别
     */
    public void getSex() {
        System.out.println("I am a male...");
    }
}
