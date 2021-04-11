package com.place.yao.uniqShopType.basedata;

/**
 * @Description
 * @Author vectoryao
 * @Date 2020-05-07 15:56
 **/
public enum ChainOnlineShopMode {
    UNITED_ONLINE_SHOP(1),
    BRANCH_ONLINE_SHOP(2);

    private final int value;

    ChainOnlineShopMode(int value) {
        this.value = value;
    }

    /**
     * Get the integer value of this enum value, as defined in the Thrift IDL.
     */
    public int getValue() {
        return value;
    }

}
