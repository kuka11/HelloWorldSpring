package pl.webtrue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping({"/", "index"})
	public String helloWorld() {
		return "helloWorld";
	}
}
