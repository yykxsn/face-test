package com.tczs.bababa;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import com.tczs.bababa.model.Hotel;
import com.tczs.bababa.type.CustomerEnum;

/**
 * 
 * @author TaoerLi
 *
 */
public class HotelTest {
	
	@Test
	public void testCalcToalPrice() {
		Hotel hotel = new Hotel();
		hotel.setName("Lakewood");
		hotel.setRating(3);
		hotel.setWeekdayRegularPrice(new BigDecimal(110));
		hotel.setWeekdayRewardsPrice(new BigDecimal(80));
		hotel.setWeekendRegularPrice(new BigDecimal(90));
		hotel.setWeekendRewardsPrice(new BigDecimal(80));
		assertEquals(new BigDecimal(200), hotel.calcToalPrice(CustomerEnum.REGULAR,  new String[] {"2020-08-17","2020-08-16"}));
	}
}
