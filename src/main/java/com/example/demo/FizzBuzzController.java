package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FizzBuzzController {
	String result = "";

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/apply", method = RequestMethod.POST)
	public ModelAndView apply(@RequestParam("num") int num, ModelAndView mv) {

		if (num % 3 == 0 && num % 5 == 0 && num % 7 == 0 && num != 0) {
			result = "FizzBuzzAss";

		} else if (num % 3 == 0 && num % 5 == 0 && num != 0) {
			result = "FizzBuzz";
			
		} else if (num % 3 == 0 && num % 7 == 0 && num != 0) {
			result = "FizzAss";
			
		} else if (num % 5 == 0 && num % 7 == 0 && num != 0) {
			result = "BuzzAss";

		} else if (num % 3 == 0 && num != 0) {
			result = "Fizz";

		} else if (num % 5 == 0 && num != 0) {
			result = "Buzz";

		} else if (num % 7 == 0 && num != 0) {
			result = "Ass";
		} else {
			result = "あllllllll";
		}
		mv.addObject("result", result);
		mv.addObject("num", num);

		mv.setViewName("index");
		return mv;
	}

}
