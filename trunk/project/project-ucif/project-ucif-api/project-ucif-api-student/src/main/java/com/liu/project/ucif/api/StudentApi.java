package com.liu.project.ucif.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.liu.project.ucif.model.Student;
import com.liu.project.ucif.service.StudentService;
import com.liu.project.ucif.vo.ListResponseVo;

import net.sf.json.JSONObject;

/**
 * @desc 
 * @author Liuweian
 * @createTime 2017年12月25日 下午1:46:47
 * @version 1.0
 */
@Controller
@RequestMapping("student/")
public class StudentApi {
	
	@Autowired
	private StudentService studentService;
	
	/**
	 * @desc 返回json数据的
	 * @author Liuweian
	 * @createTime 2017年12月25日 下午1:52:08
	 * @return 参数列表
	 */
	@RequestMapping("list")
	@ResponseBody
	public JSONObject index() {
		ListResponseVo student = new ListResponseVo();
		student.setAge(25);
		student.setName("zhangsan");
		
		ListResponseVo student2 = new ListResponseVo();
		student2.setAge(10);
		student2.setName("lisi");
		
		List<ListResponseVo> list = new ArrayList<ListResponseVo>();
		list.add(student);
		list.add(student2);
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("list", list);
		
		return jsonObject;
	}
	
	
	/**
	 * @desc 返回页面的
	 * @author Liuweian
	 * @createTime 2017年12月25日 下午1:53:06
	 * @return
	 */
	@RequestMapping("add")
	public String index2() {
		try {
			Student student = studentService.getById(1);
			System.out.println("Student add method : " + student.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "student/add";
	}
}
