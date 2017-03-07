package com.gy.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gy.biz.UserInfoBiz;

@Controller
public class AdminController {
	private UserInfoBiz adminBiz;

	public UserInfoBiz getAdminBiz() {
		return adminBiz;
	}
	@Resource(name="userInfoBizImpl")
	public void setAdminBiz(UserInfoBiz adminBiz) {
		this.adminBiz = adminBiz;
	}
	@RequestMapping(value="/login.action")
	public String show(){
		return "page/login";
	}
}
