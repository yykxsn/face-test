package com.tczs.bababa.action;

import java.math.BigDecimal;

import com.tczs.bababa.data.HotelData;
import com.tczs.bababa.model.Hotel;
import com.tczs.bababa.type.CustomerEnum;

/**
 * 酒店执行方案
 * @author TaoerLi
 *
 */
public class HotelAction {

	public String getCheapestHotel(CustomerEnum customerEnum,String[] dateStrs) {
		if(HotelData.hotelList.size() == 0) {
			return null;
		}else {
			Hotel cheapestHotel = HotelData.hotelList.get(0);
			BigDecimal cheapestPrice = cheapestHotel.calcToalPrice(customerEnum, dateStrs);
			for(int i=1;i<HotelData.hotelList.size();i++) {
				Hotel currentHotel = HotelData.hotelList.get(i);
				BigDecimal currentPrice = currentHotel.calcToalPrice(customerEnum, dateStrs);
				if(cheapestPrice.compareTo(currentPrice) == 1) {
					cheapestHotel = currentHotel;
					cheapestPrice = currentPrice;
				}
				if(cheapestPrice.compareTo(currentPrice)==0 && 
						cheapestHotel.getRating() < currentHotel.getRating()) {
					cheapestHotel = currentHotel;
				}
			}
			return cheapestHotel.getName();
		}
	}
}
