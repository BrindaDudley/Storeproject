package com.tts.Store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tts.Store.domain.User;
import com.tts.Store.service.IUserService;

@Controller
public class AuthenticationController {
	@Autowired
	IUserService iUserService;
	
	@GetMapping("/signin")
	public String logIn()
	{
		return "index";
	}
	@GetMapping("/signUp")
	public String singUp(Model model )
	{
		User user=new User();
		model.addAttribute("user",user);
		return "signup";
	}
	@PostMapping("/signUp")
	public String addUser(Model model,User user)
	{
		iUserService.addUser(user);
		return "signin";
	}
	

}
