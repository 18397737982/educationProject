 package com.gy.beans;

import java.io.Serializable;
import java.math.BigDecimal;


public class Course  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer course_id;//课程id
	private String course_name;//课程名
	private String coursephoto;//课程头像
	private String course_description;// 描述
	private Integer class_id; // --课程类别id
	private Integer course_view;// --浏览量
	private BigDecimal price; //价格
	private Class_category lass_category;
	
	private UserInfo userInfo;

	public Integer getCourse_id() {
		return course_id;
	}

	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getCoursephoto() {
		return coursephoto;
	}

	public void setCoursephoto(String coursephoto) {
		this.coursephoto = coursephoto;
	}

	public String getCourse_description() {
		return course_description;
	}

	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}

	public Integer getClass_id() {
		return class_id;
	}

	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}

	public Integer getCourse_view() {
		return course_view;
	}

	public void setCourse_view(Integer course_view) {
		this.course_view = course_view;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Class_category getLass_category() {
		return lass_category;
	}

	public void setLass_category(Class_category lass_category) {
		this.lass_category = lass_category;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	
	
}
