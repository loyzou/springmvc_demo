package com.sufow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TestController {
	 @RequestMapping("/hello")
	 public ModelAndView helloWorld() { 
	  String message = "Hello World, Spring 3.0!";
	  System.out.println(message);
	  return new ModelAndView("mypage", "message", message);
	 } 


}
