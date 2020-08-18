package com.tczs.bababa.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间格式化工具
 * 
 * @author TaoerLi
 *
 */
public class DateUtil {

	public static Date convertToDate(String value, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		if (value != null && value.length()>0) {
			try {
				return sdf.parse(value);
			} catch (Exception e) {
				System.err.println("Exception caught: " + e.getMessage());
			}
		}
		return null;
	}
	
	// 得到日期是周几
	public static int getDayOfWeek(String dateStr) {
		Date date = convertToDate(dateStr,"yyyy-MM-dd");
		if(date == null) {
			throw new RuntimeException("please check your date format!");
		}
		Calendar cld = Calendar.getInstance();
		cld.setTime(date);
		return cld.get(Calendar.DAY_OF_WEEK);
	}
}
