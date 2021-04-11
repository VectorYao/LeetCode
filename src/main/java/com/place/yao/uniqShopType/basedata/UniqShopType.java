package com.place.yao.uniqShopType.basedata;

import java.util.Objects;

/**
 * @author zhangwenhao on 2018/11/28
 */
public enum UniqShopType {
    /**
     * 店铺类型枚举类
     * 文档：https://doc.qima-inc.com/pages/viewpage.action?pageId=50301813
     *
     * onlineShopOpen 对总部、合伙人来说是null, 对门店来说才有true false
     * 大网店下，所有门店的isOnlineShopOpen=false, 多网店下，门店的isOnlineShopOpen true false都可以有
     */
    /**
     * 微商城
     * --WSC
     */
    WSC(1, ShopTypeConstants.WSC, ShopRoleConstants.RETAIL_SINGLE, ShopTopic.NONE.getValue(), null, null, null, null, "微商城"),
    /**
     * 微商城教育版
     * --WSC_EDU
     */
    WSC_EDUCATION(2, ShopTypeConstants.WSC, ShopRoleConstants.RETAIL_SINGLE, ShopTopic.WSC_EDUCATION.getValue(), null, null, null, null, "微商城教育版"),

    /**
     * 教育连锁总部（教育多校区总部）
     */
    WSC_EDUCATION_HEAD_QUARTER(28, ShopTypeConstants.WSC, ShopRoleConstants.RETAIL_UNION, ShopTopic.WSC_EDUCATION.getValue(), ChainOnlineShopMode.BRANCH_ONLINE_SHOP.getValue(), null, null, null, "教育连锁总部（教育多校区总部）"),
    /**
     * 教育单店（校区）
     */
    EDUCATION_PART_CAMPUS(29, ShopTypeConstants.WSC, ShopRoleConstants.RETAIL_STORE, ShopTopic.WSC_EDUCATION.getValue(), ChainOnlineShopMode.BRANCH_ONLINE_SHOP.getValue(), true, false, null, "教育单店（校区）"),

    /**
     * 微商城网店模式 总部
     */
    WSC_ONLINE_MODE_QUARTER(30, ShopTypeConstants.WSC, ShopRoleConstants.RETAIL_UNION, ShopTopic.NONE.getValue(), ChainOnlineShopMode.BRANCH_ONLINE_SHOP.getValue(), null, null, null, "微商城网店模式 总部"),

    /**
     * 爱学贷
     * --OTHER
     */
    AXD(3, ShopTypeConstants.AI_XUE_DAI, ShopRoleConstants.RETAIL_SINGLE, ShopTopic.NONE.getValue(), null, null, null, null, "爱学贷"),
    /**
     * 微商城精简版，和微商城映射相同的id
     * --WSC
     */
    WSC_SIMPLE(1, ShopTypeConstants.WSC, ShopRoleConstants.RETAIL_SINGLE, ShopTopic.NONE.getValue(), null, null, null, 3, " 微商城精简版，和微商城映射相同的id"),
    /**
     * 微商城 + 收银，与微商城映射相同id
     * --OTHER
     */
    CASH_WSC(1, ShopTypeConstants.CASH_WSC, ShopRoleConstants.RETAIL_SINGLE, ShopTopic.NONE.getValue(), null, null, null, null, "微商城 + 收银，与微商城映射相同id"),
    /**
     * 美业单店
     * --BEAUTY
     */
    BEAUTY(5, ShopTypeConstants.BEAUTY, ShopRoleConstants.RETAIL_SINGLE, ShopTopic.NONE.getValue(), null, null, null, null, " 美业单店"),
    /**
     * 美业连锁总部
     * --BEAUTY
     */
    BEAUTY_UNION(6, ShopTypeConstants.BEAUTY, ShopRoleConstants.RETAIL_UNION, ShopTopic.NONE.getValue(), null, null, null, null, "美业连锁总部"),
    /**
     * 美业运营中心
     * --BEAUTY
     */
    BEAUTY_OPERATION_CENTER(38, ShopTypeConstants.BEAUTY, ShopRoleConstants.VIRTUAL_MU, ShopTopic.NONE.getValue(), null, null, null, -1, "美业运营中心"),
    /**
     * 美业连锁区域组织
     * --BEAUTY
     */
    BEAUTY_REGION(36, ShopTypeConstants.BEAUTY, ShopRoleConstants.PARTNER, ShopTopic.NONE.getValue(), null, null, null, 4, "美业连锁区域组织"),
    /**
     * 美业连锁门店
     * --BEAUTY
     */
    BEAUTY_UNION_STORE(7, ShopTypeConstants.BEAUTY, ShopRoleConstants.RETAIL_STORE, ShopTopic.NONE.getValue(), null, null, null, null, "美业连锁门店"),

    /**
     * 零售单店
     * --RETAIL
     */
    RETAIL(8, ShopTypeConstants.RETAIL, ShopRoleConstants.RETAIL_SINGLE, ShopTopic.NONE.getValue(), null, null, null, null, "零售单店"),
    /**
     * 零售连锁总部(大网店)
     * <p>
     * --CHAIN_RETAIL
     */
    UNION_STORE_HQ(9, ShopTypeConstants.RETAIL, ShopRoleConstants.RETAIL_UNION, ShopTopic.NONE.getValue(), ChainOnlineShopMode.UNITED_ONLINE_SHOP.getValue(), null, null, null, "零售连锁总部(大网店)"),
    /**
     * 零售连锁总部(多网店)
     * --CHAIN_RETAIL
     */
    RETAIL_CHAIN_MIDDLE(10, ShopTypeConstants.RETAIL, ShopRoleConstants.RETAIL_UNION, ShopTopic.NONE.getValue(), ChainOnlineShopMode.BRANCH_ONLINE_SHOP.getValue(), null, null, null, "零售连锁总部(多网店)"),
    /**
     * 零售连锁门店，不支持网店(大网店）
     * --OTHER
     */
    RETAIL_CHAIN_UNION_STORE(11, ShopTypeConstants.RETAIL, ShopRoleConstants.RETAIL_STORE, ShopTopic.NONE.getValue(), ChainOnlineShopMode.UNITED_ONLINE_SHOP.getValue(), false, true, null, "零售连锁门店，不支持网店(大网店）"),
    /**
     * 零售连锁门店（含网店)
     * --OTHER
     */
    RETAIL_CHAIN_STORE_ONLINE(12, ShopTypeConstants.RETAIL, ShopRoleConstants.RETAIL_STORE, ShopTopic.NONE.getValue(), ChainOnlineShopMode.BRANCH_ONLINE_SHOP.getValue(), true, true, null, "零售连锁门店（含网店)"),
    /**
     * 零售连锁门店（中台版)(不含网店-多网店）
     * --OTHER
     */
    RETAIL_CHAIN_STORE_MIDDLE(13, ShopTypeConstants.RETAIL, ShopRoleConstants.RETAIL_STORE, ShopTopic.NONE.getValue(), ChainOnlineShopMode.BRANCH_ONLINE_SHOP.getValue(), false, true, null, "零售连锁门店（中台版)(不含网店-多网店）"),
    /**
     * 零售连锁合伙人(大网店)
     * --CHAIN_RETAIL
     */
    RETAIL_PARTNER_UNITED(14, ShopTypeConstants.RETAIL, ShopRoleConstants.PARTNER, ShopTopic.NONE.getValue(), ChainOnlineShopMode.UNITED_ONLINE_SHOP.getValue(), null, null, null, "零售连锁合伙人(大网店)"),
    /**
     * 零售连锁合伙人(多网店)
     * --CHAIN_RETAIL
     */
    RETAIL_PARTNER_BRANCH(15, ShopTypeConstants.RETAIL, ShopRoleConstants.PARTNER, ShopTopic.NONE.getValue(), ChainOnlineShopMode.BRANCH_ONLINE_SHOP.getValue(), null, null, null, "零售连锁合伙人(多网店)"),
    /**
     * 仓库
     * --OTHER
     */
    WAREHOUSE(16, ShopTypeConstants.WAREHOUSE, ShopRoleConstants.WAREHOUSE, ShopTopic.NONE.getValue(), null, null, null, null, "仓库"),
    /**
     * 餐饮
     * --OTHER
     */
    CATERING(17, ShopTypeConstants.CATERING, ShopRoleConstants.RETAIL_SINGLE, ShopTopic.NONE.getValue(), null, null, null, null, "餐饮"),
    /**
     * 收银
     * --OTHER
     */
    CASH(18, ShopTypeConstants.CASH, ShopRoleConstants.RETAIL_SINGLE, ShopTopic.NONE.getValue(), null, null, null, null, "收银"),
    /**
     * 零售总部版
     * --CHAIN_RETAIL
     */
    RETAIL_UNION(19, ShopTypeConstants.RETAIL_UNION, ShopRoleConstants.RETAIL_SINGLE, ShopTopic.NONE.getValue(), null, null, null, null, "零售总部版"),
    /**
     * 微小店
     * --OTHER
     */
    WXD(20, ShopTypeConstants.WXD, ShopRoleConstants.RETAIL_SINGLE, ShopTopic.NONE.getValue(), null, null, null, null, " 微小店"),

    /**
     * 通用-有赞云创建店铺
     * --OTHER
     */
    UNIVERSAL(21, ShopTypeConstants.UNIVERSAL, ShopRoleConstants.RETAIL_SINGLE, ShopTopic.NONE.getValue(), null, null, null, null, "通用-有赞云创建店铺"),

    /**
     * 零售3.0 网店 --单店版
     * -- 零售3.0 总部（MU）
     */
    RETAIL_CHAIN_ONLINE_STORE(22, ShopTypeConstants.RETAIL, ShopRoleConstants.RETAIL_STORE, ShopTopic.NONE.getValue(), ChainOnlineShopMode.BRANCH_ONLINE_SHOP.getValue(), true, false, 1, "零售3.0 网店 --单店版"),

    /**
     * 零售3.0门店  --单店版
     * -- 零售3.0 总部(BU)
     */
    RETAIL_CHAIN_STORE(23, ShopTypeConstants.RETAIL, ShopRoleConstants.RETAIL_STORE, ShopTopic.NONE.getValue(), ChainOnlineShopMode.BRANCH_ONLINE_SHOP.getValue(), false, true, 1, " 零售3.0门店  --单店版"),

    /**
     * 零售3.0 网店 --连锁版
     * --MU
     */
    REATIL_CHAIN_ONLINE_STORE_MULTI(26, ShopTypeConstants.RETAIL, ShopRoleConstants.RETAIL_STORE, ShopTopic.NONE.getValue(), ChainOnlineShopMode.BRANCH_ONLINE_SHOP.getValue(), true, false, 2, "零售3.0 网店 --连锁版"),

    /**
     * 3.0 网店 (极简版)
     */
    REATIL_CHAIN_ONLINE_STORE(40, ShopTypeConstants.RETAIL, ShopRoleConstants.RETAIL_STORE, ShopTopic.NONE.getValue(), ChainOnlineShopMode.BRANCH_ONLINE_SHOP.getValue(), true, false, 7003, "零售3.0 网店 --连锁版"),

    /**
     * 零售3.0门店  --连锁版
     * --BU
     */
    REATIL_CHAIN_STORE_MULTI(27, ShopTypeConstants.RETAIL, ShopRoleConstants.RETAIL_STORE, ShopTopic.NONE.getValue(), ChainOnlineShopMode.BRANCH_ONLINE_SHOP.getValue(), false, true, 2, "零售3.0门店  --连锁版"),

    /**
     * 零售连锁3.0-合伙人 零售-单店解决方案
     */
    RETAIL_PARTNER_RETAIL_SINGLE(33, ShopTypeConstants.RETAIL, ShopRoleConstants.PARTNER, ShopTopic.NONE.getValue(), ChainOnlineShopMode.BRANCH_ONLINE_SHOP.getValue(), false, true, 1, "零售连锁3.0-合伙人 零售-单店解决方案"),

    /**
     * 零售连锁3.0-合伙人 零售-连锁解决方案
     */
    RETAIL_PARTNER_RETAIL_CHAIN(34, ShopTypeConstants.RETAIL, ShopRoleConstants.PARTNER, ShopTopic.NONE.getValue(), ChainOnlineShopMode.BRANCH_ONLINE_SHOP.getValue(), null, null, 2, "零售连锁3.0-合伙人 零售-连锁解决方案"),


    /**
     * 零售连锁总部（单店版）
     * --CHAIN_RETAIL
     */
    RETAIL_CHAIN_BASE_SINGLE(24, ShopTypeConstants.RETAIL, ShopRoleConstants.RETAIL_UNION, ShopTopic.NONE.getValue(), ChainOnlineShopMode.BRANCH_ONLINE_SHOP.getValue(), null, null, 1, " 零售连锁总部（单店版）"),

    /**
     * 零售连锁总部（连锁版）
     * --CHAIN_RETAIL
     */
    RETAIL_CHAIN_BASE_MULTI(25, ShopTypeConstants.RETAIL, ShopRoleConstants.RETAIL_UNION, ShopTopic.NONE.getValue(), ChainOnlineShopMode.BRANCH_ONLINE_SHOP.getValue(), null, null, 2, "零售连锁总部（连锁版）"),

    /**
     * 前置仓
     */
    PRE_WAREHOUSE(35, ShopTypeConstants.RETAIL, ShopRoleConstants.PRE_WAREHOUSE, ShopTopic.NONE.getValue(), ChainOnlineShopMode.BRANCH_ONLINE_SHOP.getValue(), null, null, 2, "前置仓"),

    /**
     * 微商城连锁分店
     */
    WSC_CHAIN_STORE(32, ShopTypeConstants.WSC, ShopRoleConstants.RETAIL_STORE, ShopTopic.NONE.getValue(), ChainOnlineShopMode.BRANCH_ONLINE_SHOP.getValue(), true, false, null, "微商城连锁分店"),

    /**
     * 零售连锁总部（极简版）
     * --CHAIN_RETAIL
     */
    RETAIL_CHAIN_BASE_LITE(37, ShopTypeConstants.RETAIL, ShopRoleConstants.RETAIL_UNION, ShopTopic.NONE.getValue(), ChainOnlineShopMode.BRANCH_ONLINE_SHOP.getValue(), null, null, 7003, "零售连锁总部（极简版）"),

    /**
     * 零售连锁总部（极简版）
     * --合伙人
     */
    RETAIL_PARTNER_LITE(39, ShopTypeConstants.RETAIL, ShopRoleConstants.PARTNER, ShopTopic.NONE.getValue(), ChainOnlineShopMode.BRANCH_ONLINE_SHOP.getValue(), null, null, 7003, "微商城连锁合伙人"),

    UNKNOWN(null, null, null, null, null, null, null, null, null),
    ;

    private Integer id;
    private Integer shopType;
    private Integer shopRole;
    private Integer shopTopic;
    private Integer chainOnlineShopMode;
    private Boolean onlineShopOpen;
    private Boolean offlineShopOpen;
    private Integer saasSolution; //1是单店版 2是连锁版 魔法值。。
    private String name;

    UniqShopType(Integer id, Integer shopType, Integer shopRole, Integer shopTopic, Integer chainOnlineShopMode, Boolean onlineShopOpen, Boolean offlineShopOpen, Integer saasSolution, String name) {
        this.id = id;
        this.shopType = shopType;
        this.shopRole = shopRole;
        this.shopTopic = shopTopic;
        this.chainOnlineShopMode = chainOnlineShopMode;
        this.onlineShopOpen = onlineShopOpen;
        this.offlineShopOpen = offlineShopOpen;
        this.saasSolution = saasSolution;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getShopType() {
        return shopType;
    }

    public Integer getShopRole() {
        return shopRole;
    }

    public Integer getShopTopic() {
        return shopTopic;
    }

    public Integer getChainOnlineShopMode() {
        return chainOnlineShopMode;
    }

    public Boolean getOnlineShopOpen() {
        return onlineShopOpen;
    }

    public Boolean getOfflineShopOpen() {
        return offlineShopOpen;
    }

    public Integer getSaasSolution() {
        return saasSolution;
    }

    public String getName() {
        return name;
    }

    public static UniqShopType getUniqShopType(ShopMetaData.ShopMetaInfo metaInfo) {
        if (Objects.isNull(metaInfo)) {
            return null;
        }
        //美业总部在店铺层级改造项目中，店铺侧区分了基础版(saasSolution=3)和专业版(saasSolution=4)，为了不对现有美业总部店铺类型造成影响，这里做下兼容逻辑，去除saasSolution的判断
        if (Objects.equals(BEAUTY_UNION.getShopType(), metaInfo.getShopType())
                && Objects.equals(BEAUTY_UNION.getShopRole(), metaInfo.getShopRole())
                && Objects.equals(BEAUTY_UNION.getShopTopic(), metaInfo.getShopTopic())
                && Objects.equals(BEAUTY_UNION.getChainOnlineShopMode(), metaInfo.getChainOnlineShopMode())
                && Objects.equals(BEAUTY_UNION.getOnlineShopOpen(), metaInfo.getOnlineShopOpen())
                && Objects.equals(BEAUTY_UNION.getOfflineShopOpen(), metaInfo.getOfflineShopOpen())) {
            return BEAUTY_UNION;
        }

        //美业门店在店铺层级改造项目中，店铺侧区分了新增返回字段saasSolution，为了不对现有美业门店店铺类型造成影响，这里做下兼容逻辑，去除saasSolution的判断
        if (Objects.equals(BEAUTY_UNION_STORE.getShopType(), metaInfo.getShopType())
                && Objects.equals(BEAUTY_UNION_STORE.getShopRole(), metaInfo.getShopRole())
                && Objects.equals(BEAUTY_UNION_STORE.getShopTopic(), metaInfo.getShopTopic())
                && Objects.equals(BEAUTY_UNION_STORE.getChainOnlineShopMode(), metaInfo.getChainOnlineShopMode())
                && Objects.equals(BEAUTY_UNION_STORE.getOnlineShopOpen(), metaInfo.getOnlineShopOpen())
                && Objects.equals(BEAUTY_UNION_STORE.getOfflineShopOpen(), metaInfo.getOfflineShopOpen())) {
            return BEAUTY_UNION_STORE;
        }

        for (UniqShopType value : values()) {
            if (Objects.equals(value.getShopType(), metaInfo.getShopType())
                    && Objects.equals(value.getShopRole(), metaInfo.getShopRole())
                    && Objects.equals(value.getShopTopic(), metaInfo.getShopTopic())
                    && Objects.equals(value.getChainOnlineShopMode(), metaInfo.getChainOnlineShopMode())
                    && Objects.equals(value.getOnlineShopOpen(), metaInfo.getOnlineShopOpen())
                    && Objects.equals(value.getOfflineShopOpen(), metaInfo.getOfflineShopOpen())
                    && (Objects.equals(value.getSaasSolution(), -1) || Objects.equals(value.getSaasSolution(), metaInfo.getSaasSolution()))
            ) {
                return value;
            }
        }
        return null;
    }

}
