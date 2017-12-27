package com.liu.project.ucif.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liu.project.basis.service.impl.BasisServiceImpl;
import com.liu.project.ucif.dao.StudentDao;
import com.liu.project.ucif.model.Student;
import com.liu.project.ucif.service.StudentService;

/**
 * @desc StudentService的实现
 * @author Liuweian
 * @createTime 2017年12月22日 上午11:38:26
 * @version 1.0
 */
@Service("studentService")
public class StudentServiceImpl extends BasisServiceImpl<Student, StudentDao, Integer> implements StudentService{
	
	@Autowired
	private StudentDao studentdao;
	
	@Override
	protected StudentDao getDao() {
		return studentdao;
	}
	
	public void test() {
		System.out.println("student serviceimpl method");
		Student student;
		try {
			student = studentdao.getById(1);
			System.out.println(student.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
