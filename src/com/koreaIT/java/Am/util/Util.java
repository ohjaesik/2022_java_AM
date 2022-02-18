package com.koreaIT.java.Am.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
	public static String getNowDateTimeStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date time = new Date();

		return format.format(time);
	}
}
