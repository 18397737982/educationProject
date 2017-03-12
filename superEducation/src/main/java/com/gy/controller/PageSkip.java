package com.gy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
		return "redirect:/getAllCourseInformation.action";
	}
	
	/**
	 * topb/topbf的跳转到指定类型的课程页面
	 * @return
	 */
	@RequestMapping(value="/toCourse.action/{class_id}")
	public String toTopCourse(@PathVariable int class_id){
		return "redirect:/getCourseInformation.action/"+class_id;
	}
	
	//跳转分组界面
	@RequestMapping(value="/toGroups.action")
	public String toGroups(){
		return "page/groups";
		
	}
	
	//跳转具体课程页面
		@RequestMapping(value="/toOneCourse.action/{course_id}")
		public String toOneCourse(){
			return "page/course";
			
		}
}
