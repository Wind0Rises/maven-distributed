package com.liu.project.ucif.model;

import java.util.Date;

import com.liu.project.basis.model.BasisModel;

/**
 * @desc 老师实体
 * @author Liuweian
 * @createTime 2017年12月25日 下午3:10:16
 * @version 1.0
 */
public class Teacher extends BasisModel<Integer>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 老师姓名
	 */
	private String name;
	
	/**
	 * 老师授课科目
	 */
	private String subject;
	
	/**
	 * 老师生日
	 */
	private Date birthday;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
