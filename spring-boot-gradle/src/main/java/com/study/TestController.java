package com.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Logger;

@Controller
public class TestController {

	@RequestMapping("/")
	public ModelAndView twoPage() {
		Logger log = Logger.getLogger("spring-boot-gradle");
		log.warning("Qwerty");

		return new ModelAndView("welcome");
	}

}
