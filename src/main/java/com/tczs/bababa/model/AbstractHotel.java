package com.tczs.bababa.model;

import java.math.BigDecimal;

import com.tczs.bababa.type.CustomerEnum;
import com.tczs.bababa.util.DateUtil;

/**
 * 酒店的公共属性
 * @author TaoerLi
 *
 */
public abstract class AbstractHotel implements HotelInterface{

	private String name;
	private Integer rating;
	private BigDecimal weekdayRegularPrice;  //平日常规用户价格
	private BigDecimal weekdayRewardsPrice;  //平日特价用户价格
	private BigDecimal weekendRegularPrice;  //周末常规用户价格
	private BigDecimal weekendRewardsPrice;  //周末特价用户价格
	
	public BigDecimal calcToalPrice(CustomerEnum customerEnum,String[] dateStrs) {
		if(customerEnum == null) {
			throw new RuntimeException("customerEnum not blank!");
		}
		BigDecimal totalPrice = new BigDecimal(0);
		if(dateStrs != null && dateStrs.length > 0) {
			for(String dateStr : dateStrs) {
				int week = DateUtil.getDayOfWeek(dateStr);
				if(week==7 || week==1) {
					if(CustomerEnum.REGULAR == customerEnum) {
						totalPrice = totalPrice.add(this.weekendRegularPrice);
					}else{
						totalPrice = totalPrice.add(this.weekendRewardsPrice);
					}
				}else {
					if(CustomerEnum.REGULAR == customerEnum) {
						totalPrice = totalPrice.add(this.weekdayRegularPrice);
					}else{
						totalPrice = totalPrice.add(this.weekdayRewardsPrice);
					}
				}
			}
		}
		return totalPrice;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public BigDecimal getWeekdayRegularPrice() {
		return weekdayRegularPrice;
	}
	public void setWeekdayRegularPrice(BigDecimal weekdayRegularPrice) {
		this.weekdayRegularPrice = weekdayRegularPrice;
	}
	public BigDecimal getWeekdayRewardsPrice() {
		return weekdayRewardsPrice;
	}
	public void setWeekdayRewardsPrice(BigDecimal weekdayRewardsPrice) {
		this.weekdayRewardsPrice = weekdayRewardsPrice;
	}
	public BigDecimal getWeekendRegularPrice() {
		return weekendRegularPrice;
	}
	public void setWeekendRegularPrice(BigDecimal weekendRegularPrice) {
		this.weekendRegularPrice = weekendRegularPrice;
	}
	public BigDecimal getWeekendRewardsPrice() {
		return weekendRewardsPrice;
	}
	public void setWeekendRewardsPrice(BigDecimal weekendRewardsPrice) {
		this.weekendRewardsPrice = weekendRewardsPrice;
	}
	
}
