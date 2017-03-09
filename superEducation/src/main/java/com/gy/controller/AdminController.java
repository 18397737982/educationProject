package com.gy.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gy.beans.UserInfo;
import com.gy.biz.UserInfoBiz;
import com.gy.util.UsuallyUtil;

@Controller
public class AdminController {
	private UserInfoBiz userInfoBiz;

	public UserInfoBiz getuserInfoBiz() {
		return userInfoBiz;
	}

	@Resource(name = "userInfoBizImpl")
	public void setuserInfoBiz(UserInfoBiz userInfoBiz) {
		this.userInfoBiz = userInfoBiz;
	}

	@RequestMapping(value = "/login.action")
	public String show() {
		return "page/login";
	}

	// 注册
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@ModelAttribute("user") UserInfo userInfo, ModelMap map) {
		userInfo.setTime(new Date());
		userInfoBiz.addAdmin(userInfo);
		return "page/login";
	}

	// 登录
	@RequestMapping(value = "/login.action", method = RequestMethod.POST)
	public String login(UserInfo userInfo, Model model, ModelMap map) {
		String name = userInfo.getUser_name();
		List<UserInfo> list = null;
		name = new UsuallyUtil().decode(name);
		if (userInfo != null && name.contains("@")) {
			list = userInfoBiz.getUserInfoByEmail(userInfo);
			if (list.size() > 0 && list != null) {
				userInfo = list.get(0);
				map.put("users", userInfo);
				model.addAttribute("users", userInfo);
			}
		} else if (userInfo != null && !name.contains("@")) {
			userInfo.setUser_name(name);
			userInfo.toString();
			list = userInfoBiz.getUserInfoByUserName(userInfo);
			if (list.size() > 0 && list != null) {
				map.put("users", list.get(0));
				model.addAttribute("users", userInfo);
			}
		}
		// 登录页面跳转
		if (userInfo == null) {
			map.put("Message", "block");
			map.put("users", "");
			return "login";
		}
		return "page/index";
	}

	// 注销
	@ResponseBody
	@RequestMapping(value = "/loginOut.action")
	public boolean loginOut(HttpSession session, HttpServletRequest request, Model model) {
		model.addAttribute("users", null);
		session.removeAttribute("users");
		return true;
	}
}
