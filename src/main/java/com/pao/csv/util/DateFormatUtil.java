package com.pao.csv.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatUtil {

	public static final String DDMMYYYYHHMMSS = "ddMMyyyyHHmmSS";

	public static Date todayDate() {
		return new Date();
	}

	public static String getMMDDYYYYHHMMSSADate() {
		SimpleDateFormat format = new SimpleDateFormat(DDMMYYYYHHMMSS);
		return format.format(DateFormatUtil.todayDate());
	}
}
