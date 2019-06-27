package com.controller;

import javax.servlet.http.*;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class NumberController implements InitializingBean{

	
	@RequestMapping("/addNumbers")
	public ModelAndView addNumber(HttpServletRequest request,HttpServletResponse response)
	{
		int num1=Integer.parseInt(request.getParameter("number1"));
		int num2=Integer.parseInt(request.getParameter("number2"));
		int result = num1 + num2;
		
		ModelAndView modelAndView = new ModelAndView("Result.jsp", "Result", result);
		modelAndView.addObject("TestObject", "Hello");
		return modelAndView;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialized Controller");
		
	}

}
