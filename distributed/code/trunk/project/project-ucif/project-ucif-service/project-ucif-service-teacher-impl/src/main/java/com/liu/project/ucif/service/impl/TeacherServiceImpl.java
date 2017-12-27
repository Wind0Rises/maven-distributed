package com.liu.project.ucif.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liu.project.basis.service.impl.BasisServiceImpl;
import com.liu.project.ucif.dao.TeacherDao;
import com.liu.project.ucif.model.Teacher;
import com.liu.project.ucif.service.TeacherService;

/**
 * @desc teacherService的实现
 * @author Liuweian
 * @createTime 2017年12月25日 下午3:55:57
 * @version 1.0
 */
@Service("teacherService")
public class TeacherServiceImpl extends BasisServiceImpl<Teacher, TeacherDao, Integer> implements TeacherService{

	@Autowired
	private TeacherDao teacherDao;
	
	@Override
	protected TeacherDao getDao() {
		return this.teacherDao;
	}

	public void test() {
		Teacher teacher;
		try {
			teacher = teacherDao.getById(1);
			System.out.println(teacher.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
