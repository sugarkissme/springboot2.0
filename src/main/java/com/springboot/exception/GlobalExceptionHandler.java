package com.springboot.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice(basePackages="com.springboot")
public class GlobalExceptionHandler  {
	@ResponseBody
	@ExceptionHandler(RuntimeException.class)
	public Map<String,Object> error(){
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("error", "500");
		hashMap.put("errorMsg", "系统错误");
		return hashMap;
	}
}
