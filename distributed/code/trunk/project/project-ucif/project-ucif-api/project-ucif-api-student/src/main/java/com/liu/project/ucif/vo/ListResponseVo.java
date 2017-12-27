package com.liu.project.ucif.vo;

/**
 * @desc list的json响应参数对象
 * @author Liuweian
 * @createTime 2017年12月25日 下午1:49:40
 * @version 1.0
 */
public class ListResponseVo {
	/**
	 * 学生姓名
	 */
	private String name;
	
	/**
	 * 学生年龄
	 */
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
