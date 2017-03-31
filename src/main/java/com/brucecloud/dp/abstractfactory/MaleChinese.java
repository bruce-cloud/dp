package com.brucecloud.dp.abstractfactory;

/**
 * 抽象工厂模式-中国男人实现类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6654030.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 23:24.
 *
 * @author yaoxh.
 */
public class MaleChinese extends AbstractChinese {
    /**
     * 获取性别
     */
    public void getSex() {
        System.out.println("我是男人...");
    }
}
