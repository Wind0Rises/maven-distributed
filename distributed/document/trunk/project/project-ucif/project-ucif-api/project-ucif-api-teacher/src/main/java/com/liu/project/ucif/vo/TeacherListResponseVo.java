package com.liu.project.ucif.vo;

/**
 * @desc list的json响应参数对象
 * @author Liuweian
 * @createTime 2017年12月25日 下午1:49:40
 * @version 1.0
 */
public class TeacherListResponseVo {
	
	/**
	 * 老师主键
	 */
	private int id;
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
	private String birthday;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
}
