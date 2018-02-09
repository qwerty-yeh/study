package com.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping("/")
	public String firstPage() {
		return "AA";
	}
	
	@RequestMapping("/welcome.html")
	public ModelAndView twoPage() {
		return new ModelAndView("welcome");
	}

}
