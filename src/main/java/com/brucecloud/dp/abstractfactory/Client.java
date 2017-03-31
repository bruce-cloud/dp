package com.brucecloud.dp.abstractfactory;

/**
 * 抽象工厂模式-场景类.
 * 博客原文地址: http://www.cnblogs.com/brucecloud/p/6654030.html
 * GitHub地址: https://github.com/bruce-cloud/dp
 * <p>
 * created at 2017/3/31 23:35.
 *
 * @author yaoxh.
 */
public class Client {
    public static void main(String[] args) {
        // 男性工厂
        HumanFactory maleFactory = new MaleFactory();
        // 女性工厂
        HumanFactory femaleFactory = new FemaleFactory();
        // 生产中国男性
        Human maleChinese = maleFactory.createChinese();
        // 生产英国男性
        Human maleEnglish = maleFactory.createEnglish();
        // 生产中国女性
        Human femaleChinese = femaleFactory.createChinese();
        // 生产英国女性
        Human femaleEnglish = femaleFactory.createEnglish();

        System.out.println("=====产出中国男人=====");
        maleChinese.getCountry();
        maleChinese.talk();
        maleChinese.getSex();

        System.out.println("=====产出英国男人=====");
        maleEnglish.getCountry();
        maleEnglish.talk();
        maleEnglish.getSex();

        System.out.println("=====产出中国女人=====");
        femaleChinese.getCountry();
        femaleChinese.talk();
        femaleChinese.getSex();

        System.out.println("=====产出英国女人=====");
        femaleEnglish.getCountry();
        femaleEnglish.talk();
        femaleEnglish.getSex();
    }
}