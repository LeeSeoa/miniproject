package com.kdt.toy.index;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	@GetMapping("/")
	public String index() {
		logger.info("로그작성");
		return "index";
	}
	
}
