package com.tts.Store.service;

import java.util.List;

import com.tts.Store.domain.Item;

public interface IItemService {
	
	List<Item> sortByCategory();
	List<Item> sortByBrand();

}
