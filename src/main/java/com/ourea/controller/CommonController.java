package com.ourea.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ourea.common.Config;
import com.ourea.common.bean.Result;

@RequestMapping("/rest/common")
@Controller
public class CommonController {
	private static final Logger logger= Logger.getLogger(CommonController.class);
	
	@Autowired
	private Config config;
	
	@RequestMapping(value="method1", method = RequestMethod.GET)
	public @ResponseBody Result<String> annotationJsonChannel(String input){
		logger.info("正在访问annotationJsonChannel方法");
		System.out.println("syso正在访问annotationJsonChannel方法");
		System.out.println("config.projectname=" + config.getProjectName());
		return Result.success(input);
	}
}
