package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShowMsg {

	@Value("${name}")
	private String name;
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public @ResponseBody String showMsg( ) {
		return "hello you你好" + name;
	}
	
	@GetMapping("/hello")
	public @ResponseBody String showMsg(Model model) {
		return "hello you你好" + name;
	}
}
