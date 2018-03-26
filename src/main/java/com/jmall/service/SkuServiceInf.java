package com.jmall.service;

import java.util.List;

import com.jmall.bean.T_MALL_PRODUCT;
import com.jmall.bean.T_MALL_SKU;
import com.jmall.bean.T_MALL_SKU_ATTR_VALUE;

public interface SkuServiceInf {

	void save_sku(T_MALL_SKU sku, T_MALL_PRODUCT spu, List<T_MALL_SKU_ATTR_VALUE> list_attr);

}
