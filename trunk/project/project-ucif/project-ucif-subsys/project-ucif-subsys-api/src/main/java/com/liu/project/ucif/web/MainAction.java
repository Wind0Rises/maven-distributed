package com.liu.project.ucif.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liu.project.ucif.model.Student;
import com.liu.project.ucif.model.Teacher;
import com.liu.project.ucif.service.StudentService;
import com.liu.project.ucif.service.TeacherService;

/**
 * @desc 主入口
 * @author Liuweian
 * @createTime 2017年12月20日 下午7:39:58
 * @version 1.0
 */
@Controller
public class MainAction {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private TeacherService teacherService;
	
	/**
	 * @desc 首页
	 * @author Liuweian
	 * @createTime 2017年12月25日 下午1:56:52
	 * @return
	 */
	@RequestMapping("/index")
	public String index() {
		try {
			Student student = studentService.getById(1);
			System.out.println("Main index method---- student name :  " + student.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Teacher teacher = teacherService.getById(1);
			System.out.println("Main index method---- student name :  " + teacher.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}
}
