package com.brucecloud.dp.abstractfactory;

/**
 * 抽象工厂模式-女性人类工厂实现类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6654030.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 23:34.
 *
 * @author yaoxh.
 */
public class FemaleFactory implements HumanFactory {
    /**
     * 创建中国人
     *
     * @return 中国人
     */
    public AbstractChinese createChinese() {
        return new FemaleChinese();
    }

    /**
     * 创建英国人
     *
     * @return 英国人
     */
    public AbstractEnglish createEnglish() {
        return new FemaleEnglish();
    }
}
