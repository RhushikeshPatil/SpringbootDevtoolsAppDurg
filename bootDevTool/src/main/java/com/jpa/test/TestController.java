package com.jpa.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		int a = 20 ;
		int b = 30;
		int c = 20;
		
		return "this is just testing , sum of a  and b is : " + (a+b+c);
		
	}
}
