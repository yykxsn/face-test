package com.tczs.bababa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tczs.bababa.action.HotelAction;
import com.tczs.bababa.type.CustomerEnum;

/**
 * 
 * @author TaoerLi
 *
 */
public class HotelActionTest {
	
	@Test
	public void testCalcToalPrice() {
		HotelAction hotelAction = new HotelAction();
		
		assertEquals("Lakewood", hotelAction.getCheapestHotel(
				CustomerEnum.REGULAR,new String[] {"2009-03-16","2020-03-17","2020-03-18"}));
		
		assertEquals("Bridgewood", hotelAction.getCheapestHotel(
				CustomerEnum.REGULAR,new String[] {"2009-03-20","2020-03-21","2020-03-22"}));
		
		assertEquals("Ridgewood", hotelAction.getCheapestHotel(
				CustomerEnum.REWARDS,new String[] {"2009-03-26","2020-03-27","2020-03-28"}));
	}
}
