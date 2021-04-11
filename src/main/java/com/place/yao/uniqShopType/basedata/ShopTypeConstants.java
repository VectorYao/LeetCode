package com.place.yao.uniqShopType.basedata;

import java.util.Arrays;
import java.util.List;

/**
 * Created by child on 22/01/2018.
 * 店铺类型常量类
 */
public class ShopTypeConstants {

    /**
     * 店铺不存在
     */
    public final static Integer NO_TYPE = -1;

    /**
     * 微商城
     */
    public final static Integer WSC = 0;

    /**
     * 微小店
     */
    public final static Integer WXD = 1;

    /**
     * 爱学贷
     */
    public final static Integer AI_XUE_DAI = 2;

    /**
     * 批发
     */
    public final static Integer PIFA = 3;

    /**
     * 批发商城
     */
    public final static Integer PIFA_MALL = 4;

    /**
     * 餐饮
     */
    public final static Integer CATERING = 5;

    /**
     * 美业
     */
    public final static Integer BEAUTY = 6;

    /**
     * 零售
     */
    public final static Integer RETAIL = 7;

    /**
     * 收银
     */
    public final static Integer CASH = 8;

    /**
     * 收银 + 微商城
     */
    public final static Integer CASH_WSC = 9;

    /**
     * 零售总部版
     */
    public final static Integer RETAIL_UNION = 10;

    /**
     * 仓库
     */
    public final static Integer WAREHOUSE = 11;

    /**
     * 通用
     */
    public final static Integer UNIVERSAL = 99;

    /**
     * 微商城的店铺类型
     */
    public static List<Integer> wscTypes = Arrays.asList(WSC, CASH_WSC);

}
