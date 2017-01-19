package com.ourea.core.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * <p>Title: PreRequestInterceptor.java</p>
 * <p>Description: 全局的拦截器</p>
 * <p>Copyright © 2017 www.souche.com. All rights reserved</p>
 * 
 * @author Kalle
 * @date   2017年1月17日 下午5:05:39
 */
public class PreRequestInterceptor extends HandlerInterceptorAdapter{

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("PreRequestInterceptor---postHandle");
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("PreRequestInterceptor---preHandle");
		return true;
	}
}
