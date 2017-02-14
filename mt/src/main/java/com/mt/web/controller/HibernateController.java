package com.mt.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HibernateController {

	@RequestMapping(value="/test")
	@ResponseBody
	public String testRelationship(){
	return "testing : controller is workingg";
	}
	
}
