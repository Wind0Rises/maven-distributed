package com.liu.project.ucif.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liu.project.ucif.model.Teacher;
import com.liu.project.ucif.service.TeacherService;
import com.liu.project.ucif.vo.TeacherListResponseVo;

import net.sf.json.JSONObject;

/**
 * @desc teacher Controller
 * @author Liuweian
 * @createTime 2017年12月25日 下午4:08:23
 * @version 1.0
 */
@Controller
@RequestMapping("teacher/")
public class TeacherApi {
	
	@Autowired
	private TeacherService teacherService;
	
	@RequestMapping("list")
	@ResponseBody
	public JSONObject list() {
		List<TeacherListResponseVo> list = new ArrayList<TeacherListResponseVo>();
		
		TeacherListResponseVo teacherListResponseVo = new TeacherListResponseVo();
		TeacherListResponseVo teacherListResponseVo2 = new TeacherListResponseVo();
		
		Teacher teacher1 = null;
		Teacher teacher2 = null;
		
		try {
			teacher1 = teacherService.getById(1);
			teacher2 = teacherService.getById(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		teacherListResponseVo.setName(teacher1.getName());
		teacherListResponseVo.setBirthday(teacher1.getBirthday().toString());
		teacherListResponseVo.setSubject(teacher1.getSubject());
		teacherListResponseVo.setId(teacher1.getId());
		
		teacherListResponseVo2.setName(teacher2.getName());
		teacherListResponseVo2.setBirthday(null);
		teacherListResponseVo2.setSubject(teacher2.getSubject());
		teacherListResponseVo2.setId(teacher2.getId());
		
		list.add(teacherListResponseVo);
		list.add(teacherListResponseVo2);
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("list", list);
		return jsonObject;
	}
	
	@RequestMapping("addPage")
	public String addPage() {
		System.out.println("Teacher addPage");
		return "teacher/addPage";
	}
	
	
}
