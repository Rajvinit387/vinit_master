package com.example.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testcontroller {
	
	@RequestMapping("/test")
	@ResponseBody
	public String handle()
	{
		return "hugga";
	}

}
