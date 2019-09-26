package com.tts.Store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.Store.domain.Item;
import com.tts.Store.repository.ItemRepository;

@Service
public class ItemService implements IItemService {
	@Autowired
	private ItemRepository itemRepository;

	public List<Item> sortByCategory() {
		
		return itemRepository.findByCategory();
	}

	public List<Item> sortByBrand() {
		
		return itemRepository.findByBrand();
	}
	
	

}
