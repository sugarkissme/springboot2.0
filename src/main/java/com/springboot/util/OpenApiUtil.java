package com.springboot.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OpenApiUtil {
	public static final SimpleDateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");
	public static String getTimeHHMMSS(Date date) {
		return dateFormat.format(date);
	}
}
