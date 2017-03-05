package com.gy.beans;

import java.io.Serializable;
import java.util.Date;

public class Admin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 883377033525727479L;
	
	private int stu_id;
	private String stu_name;
	private String realname;
	private int age;
	private String sex;
	private String pic;
	private String password;
	private String usign;
	private String introduce;
	private String email;
	private int status;
	private String stu_category;//
	private String tel;//
	private String qq;//
	private Date time;
	
	private int code;//从前台拿到的验证码
	private int sendCode;//从后台发送过去的验证码
	
	
	public Admin() {
		super();
	}


	public Admin(int stu_id, String stu_name, String realname, int age, String sex, String pic, String password,
			String usign, String introduce, String email, int status, String stu_category, String tel, String qq,
			Date time) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.realname = realname;
		this.age = age;
		this.sex = sex;
		this.pic = pic;
		this.password = password;
		this.usign = usign;
		this.introduce = introduce;
		this.email = email;
		this.status = status;
		this.stu_category = stu_category;
		this.tel = tel;
		this.qq = qq;
		this.time = time;
	}


	public int getStu_id() {
		return stu_id;
	}


	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}


	public String getStu_name() {
		return stu_name;
	}


	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}


	public String getRealname() {
		return realname;
	}


	public void setRealname(String realname) {
		this.realname = realname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getPic() {
		return pic;
	}


	public void setPic(String pic) {
		this.pic = pic;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUsign() {
		return usign;
	}


	public void setUsign(String usign) {
		this.usign = usign;
	}


	public String getIntroduce() {
		return introduce;
	}


	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public String getStu_category() {
		return stu_category;
	}


	public void setStu_category(String stu_category) {
		this.stu_category = stu_category;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getQq() {
		return qq;
	}


	public void setQq(String qq) {
		this.qq = qq;
	}


	public Date getTime() {
		return time;
	}


	public void setTime(Date time) {
		this.time = time;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public int getSendCode() {
		return sendCode;
	}


	public void setSendCode(int sendCode) {
		this.sendCode = sendCode;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Stu_user [stu_id=" + stu_id + ", stu_name=" + stu_name + ", realname=" + realname + ", age=" + age
				+ ", sex=" + sex + ", pic=" + pic + ", password=" + password + ", usign=" + usign + ", introduce="
				+ introduce + ", email=" + email + ", status=" + status + ", stu_category=" + stu_category + ", tel="
				+ tel + ", qq=" + qq + ", time=" + time + ", code=" + code + ", sendCode=" + sendCode + "]";
	}

	


	
}
