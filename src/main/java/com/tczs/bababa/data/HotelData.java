package com.tczs.bababa.data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.tczs.bababa.model.Hotel;

/**
 * 初始化酒店数据
 * @author TaoerLi
 *
 */
public class HotelData {

	public static List<Hotel> hotelList = new ArrayList<Hotel>();
	
	static {
		Hotel lakewood = new Hotel();
		lakewood.setName("Lakewood");
		lakewood.setRating(3);
		lakewood.setWeekdayRegularPrice(new BigDecimal(110));
		lakewood.setWeekdayRewardsPrice(new BigDecimal(80));
		lakewood.setWeekendRegularPrice(new BigDecimal(90));
		lakewood.setWeekendRewardsPrice(new BigDecimal(80));
		hotelList.add(lakewood);
		
		Hotel bridgewood = new Hotel();
		bridgewood.setName("Bridgewood");
		bridgewood.setRating(4);
		bridgewood.setWeekdayRegularPrice(new BigDecimal(160));
		bridgewood.setWeekdayRewardsPrice(new BigDecimal(110));
		bridgewood.setWeekendRegularPrice(new BigDecimal(60));
		bridgewood.setWeekendRewardsPrice(new BigDecimal(50));
		hotelList.add(bridgewood);
		
		Hotel ridgewood = new Hotel();
		ridgewood.setName("Ridgewood");
		ridgewood.setRating(5);
		ridgewood.setWeekdayRegularPrice(new BigDecimal(220));
		ridgewood.setWeekdayRewardsPrice(new BigDecimal(100));
		ridgewood.setWeekendRegularPrice(new BigDecimal(150));
		ridgewood.setWeekendRewardsPrice(new BigDecimal(40));
		hotelList.add(ridgewood);
	}
}
