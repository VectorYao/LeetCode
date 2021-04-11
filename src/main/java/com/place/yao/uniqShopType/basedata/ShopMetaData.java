package com.place.yao.uniqShopType.basedata;

import lombok.Data;

/**
 * @Description
 * @Author vectoryao
 * @Date 2020-05-07 15:35
 **/
@Data
public class ShopMetaData {
    @Data
    public class ShopMetaInfo {
        public Long kdtId;
        public String shopName;
        public Integer shopType;
        public Integer shopRole;
        public Long parentKdtId;
        public Long rootKdtId;
        public Integer chainOnlineShopMode;
        public Boolean onlineShopOpen;
        public Integer lockStatus;
        public Integer shopTopic;
        public Boolean offlineShopOpen;
        public Integer saasSolution;
        public Integer joinType;
        public Integer subSolution;
    }

    public String code;
    public String message;
    public String success;
    public ShopMetaInfo data;
}
