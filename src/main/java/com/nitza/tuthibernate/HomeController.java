package com.nitza.tuthibernate;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nitza.tuthibernate.dao.StudentDao;
import com.nitza.tuthibernate.model.Student;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
    private StudentDao studentDao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) 
	{
		
		List<Student> listStudent = studentDao.list();
		
		model.addAttribute("students",listStudent);
		
		return "home";
	}
	
	@RequestMapping("/sesuatu")
	@ResponseBody
	public String getSesuatu() {
		return "oke";
	}
	
}
