package com.springboot.controler;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.UserServiceTest01;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class FreemakerController {
	@Autowired
	private UserServiceTest01 userServiceTest01;
	@RequestMapping("/index")
	public String index(Map<String, Object> map) {
		log.info("访问成功");
		map.put("name", "美丽的天�?");
		map.put("sex", 1);
		map.put("age", 15);
		return "indexfree";
	}
	
	
	@RequestMapping("/insertUserTest1")
	public Integer insertUserTest1(String name, Integer age) {
		return userServiceTest01.insertUser(name, age);
	}
}
