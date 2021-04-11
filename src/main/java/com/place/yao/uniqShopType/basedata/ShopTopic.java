package com.place.yao.uniqShopType.basedata;

/**
 * @Description
 * @Author vectoryao
 * @Date 2020-05-07 15:49
 **/

public enum ShopTopic {
    NONE(0),
    WSC_EDUCATION(1);


    private final int value;

    ShopTopic(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
