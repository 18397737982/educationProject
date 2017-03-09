package com.gy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageSkip {
	
	@RequestMapping(value="/skip_index.action")
	public String toIndex(){
		return "page/index";
		
	}
	//跳转学习中心页面
	@RequestMapping(value="/learnCenter.action")
	public String tolearnCenter(){
		return "page/learnCenter";
		
	}
	//跳转课程中新页面
	@RequestMapping(value="/toCourse.action")
	public String toCourse(){
		return "page/course";
		
	}
	//跳转分组界面
	@RequestMapping(value="/toGroups.action")
	public String toGroups(){
		return "page/groups";
		
	}
}
