package com.jmall.mapper;

import java.util.List;
import java.util.Map;

import com.jmall.bean.T_MALL_PRODUCT;

public interface SpuMapper {

	void insert_spu(T_MALL_PRODUCT spu);

	void insert_images(Map<Object, Object> map);

	List<T_MALL_PRODUCT> select_spu_list(Map<Object, Object> map);


}
