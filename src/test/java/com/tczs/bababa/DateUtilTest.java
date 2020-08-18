package com.tczs.bababa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tczs.bababa.util.DateUtil;

/**
 * 
 * @author TaoerLi
 *
 */
public class DateUtilTest {
	
	@Test
	public void testGetDayOfWeek() {
		assertEquals(2,  DateUtil.getDayOfWeek("2020-08-17"));
	}
}
