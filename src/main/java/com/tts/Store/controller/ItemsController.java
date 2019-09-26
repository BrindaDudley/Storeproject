package com.tts.Store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tts.Store.service.IItemService;

@Controller
public class ItemsController {
	@Autowired
	private IItemService iItemService;
	
	
	@GetMapping("/sortByCategory")
	public String sortByCategory(Model model)
	{
		model.addAttribute("category", iItemService.sortByCategory());
		return "home";
	}
	@GetMapping("/sortByBrand")
	public String sortByBrand(Model model)
	{
		model.addAttribute("Brand", iItemService.sortByBrand());
		return "home";
	}
	
	@GetMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("itemDetailsDto", iItemService.getItems());
		return "home";
	}

}
