package com.gy.beans;

public class Stu_count {
	private int stu_count_id;
	private Course course;
	private Stu_user stu_user;
	
	
	public int getStu_count_id() {
		return stu_count_id;
	}
	public void setStu_count_id(int stu_count_id) {
		this.stu_count_id = stu_count_id;
	}
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Stu_user getStu_user() {
		return stu_user;
	}
	public void setStu_user(Stu_user stu_user) {
		this.stu_user = stu_user;
	}
	@Override
	public String toString() {
		return "Stu_count [stu_count_id=" + stu_count_id + ", course=" + course + ", stu_user=" + stu_user + "]";
	}
	
	
}
