package com.ourea.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Maps;
import com.ourea.common.Config;
import com.ourea.common.bean.Result;
import com.ourea.model.User;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

@RequestMapping("/rest/common")
@Controller
public class CommonController {
	private static final Logger logger= Logger.getLogger(CommonController.class);
	
	@Autowired
	private Config config;
	
	@RequestMapping(value="method1")
	@ApiOperation(value="通过@ResponseBody注解返回json", httpMethod="POST")
	public @ResponseBody Result<String> annotationJsonChannel(
			@ApiParam("输入") 
			@RequestParam(value = "postData")String postData){
		logger.info("正在访问annotationJsonChannel方法");
		System.out.println("syso正在访问annotationJsonChannel方法");
		System.out.println("config.projectname=" + config.getProjectName());
		return Result.success(postData);
	}
	
	@RequestMapping(value="method2")
	@ApiOperation(value="测试spring-mvc参数接收", httpMethod="POST")
	public @ResponseBody Result<Map<String, Object>> testRequestParam(
			@RequestParam(value = "字符串参数")String str, 
			@RequestParam(value = "数组参数")String[] array, 
			@RequestBody User user){
		Map<String, Object> result = Maps.newHashMap();
		result.put("str", str);
		result.put("array", array);
		result.put("user", user);
		
		return Result.success(result);
	}
}
