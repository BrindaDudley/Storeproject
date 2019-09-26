package com.tts.Store.service;

import java.util.List;

import com.tts.Store.domain.Item;
import com.tts.Store.dto.ItemDetailsDto;

public interface IItemService {
	
	List<Item> sortByCategory();
	List<Item> sortByBrand();
	ItemDetailsDto getItems();

}
