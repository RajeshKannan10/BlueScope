package com.BSIT.JPAdemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.BSIT.JPAdemo.StudentRepository.StudentDAO;
import com.BSIT.JPAdemo.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	StudentDAO studentdao;
	
	@RequestMapping("Home")
	public String student() {
		
		return "Home.jsp";
	}
	
	@RequestMapping("addstudent")
	public String addstudent(Student student) {
		
		studentdao.save(student);
		
		return "Home.jsp";
	}
	
	@RequestMapping("getstudent")
	public ModelAndView getstudent(@RequestParam int id) {
		
		ModelAndView mav = new ModelAndView("Display.jsp");
		Student student = studentdao.findById(id).orElse(new Student());
		mav.addObject(student);
		return mav;
	}
	
	@RequestMapping("deletestudent")
	public ModelAndView deletestudent(@RequestParam int id) {
		
		ModelAndView mav = new ModelAndView("Delete.jsp");
		Student student = studentdao.findById(id).orElse(new Student());
		studentdao.deleteById(id);
		mav.addObject(student);
		return mav;
	}
	
	@RequestMapping("updatestudent")
	public ModelAndView updatestudent(Student student) {
		
		ModelAndView mav = new ModelAndView("Update.jsp");
		student = studentdao.findById(student.getId()).orElse(new Student());
		studentdao.deleteById(student.getId());
		mav.addObject(student);
		return mav;
	}


}
