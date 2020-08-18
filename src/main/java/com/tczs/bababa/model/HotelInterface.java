package com.tczs.bababa.model;

import java.math.BigDecimal;

import com.tczs.bababa.type.CustomerEnum;

/**
 * 酒店公共方法
 * @author TaoerLi
 *
 */
public interface HotelInterface {

	/**
	 * 计算居住几天的总价
	 * @param customerEnum  顾客类型
	 * @param dateStrs 居住日期,日期格式"yyyy-MM-dd",这个自行约定
	 * @return
	 */
	public BigDecimal calcToalPrice(CustomerEnum customerEnum,String[] dateStrs);
	
}
