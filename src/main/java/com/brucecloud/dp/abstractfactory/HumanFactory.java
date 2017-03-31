package com.brucecloud.dp.abstractfactory;

/**
 * 抽象工厂模式-人类工厂接口.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6654030.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 23:31.
 *
 * @author yaoxh.
 */
public interface HumanFactory {
    /**
     * 创建中国人
     *
     * @return 中国人
     */
    AbstractChinese createChinese();

    /**
     * 创建英国人
     *
     * @return 英国人
     */
    AbstractEnglish createEnglish();
}
