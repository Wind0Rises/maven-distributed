package com.liu.project.ucif.model;

import com.liu.project.basis.model.BasisModel;

/**
 * @desc 学生实体
 * @author Liuweian
 * @createTime 2017年12月22日 上午11:35:40
 * @version 1.0
 */
public class Student extends BasisModel<Integer>{

	private static final long serialVersionUID = 1L;
	
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
