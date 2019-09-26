package com.tts.Store.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tts.Store.domain.Item;
import com.tts.Store.service.IItemService;
import com.tts.Store.service.ItemService;
import com.tts.Store.service.UserService;
import com.tts.Store.domain.User;

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
	@PostMapping("/addItem")
    public String addItem(Item item, Model model) {
  
            iItemService.save(item);
        return "addItem";
    }
	
	@GetMapping("/addItem")
    public String getAddItemForm(Model model) {
		model.addAttribute("item", new Item());
        return "addItem";
    }
	
	private String newItem(Model model) {
		// TODO Auto-generated method stub
		return null;
	}
	



}
