package com.place.yao.uniqShopType;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.place.yao.uniqShopType.basedata.ShopMetaData;
import com.place.yao.uniqShopType.basedata.UniqShopType;

/**
 * @Description 根据店铺元数据转换为商业化的店铺类型
 * 元数据的获取网址为：http://shopcenter-console.prod.qima-inc.com/#/shopMeta
 * @Author vectoryao
 * @Date 2020-05-07 15:31
 **/
public class UniqShopTypeTool {

    public static void main(String[] args) {
        Gson gson = new Gson();
        //解析店铺元数据
        ShopMetaData shopMetaData = gson.fromJson(shopData, ShopMetaData.class);
        ShopMetaData.ShopMetaInfo shopMetaInfo = shopMetaData.getData();

        //映射为商业化店铺类型
        UniqShopType result = UniqShopType.getUniqShopType(shopMetaInfo);
        if (result != null) {
            System.out.printf("Result: " +
                            "\n\tkdtId= %s " +
                            "\n\tkdtName = %s " +
                            "\n\tshopTypeId = %d " +
                            "\n\tshopTypeName = %s \n",
                    shopMetaInfo.getKdtId(), shopMetaInfo.getShopName(), result.getId(), result.getName());
        } else {
            System.out.printf("Parse shopType error, shopMetaInfo = %s.", JSON.toJSONString(shopMetaInfo));
        }
    }

    private static String shopData = "{\n" +
            "    \"code\": 200,\n" +
            "    \"data\": {\n" +
            "        \"kdtId\": 93114248,\n" +
            "        \"lockStatus\": 0,\n" +
            "        \"shopName\": \"YZ测试-微商城单店-商品2期\",\n" +
            "        \"shopRole\": 0,\n" +
            "        \"shopTopic\": 0,\n" +
            "        \"shopType\": 0\n" +
            "    },\n" +
            "    \"message\": \"successful\",\n" +
            "    \"success\": true\n" +
            "}";
}
