package org.springframework.demomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/demo")
public class DemoController {
	@RequestMapping("/handle01")
	public String handle01(Model model){
		Date date = new Date();
		model.addAttribute("date", date);
		return "index";
	}
}