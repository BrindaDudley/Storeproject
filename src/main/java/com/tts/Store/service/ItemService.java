package com.tts.Store.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.Store.domain.Item;
import com.tts.Store.dto.ItemDetailsDto;
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
	public ItemDetailsDto getItems() {
	Item item1 = new Item();
	item1.setItemName("Tv");
	item1.setBrand("LG");
	item1.setCategory("Electronics");
	item1.setImage("https://images.pexels.com/photos/2251206/pexels-photo-2251206.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500");
	item1.setInStock(true);
	item1.setItemId(1L);
	item1.setPrice(345);
	
	Item item2 = new Item();
	item2.setItemName("Tv");
	item2.setBrand("LG");
	item2.setCategory("Electronics");
	item2.setImage("https://images.pexels.com/photos/2251206/pexels-photo-2251206.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500");
	item2.setInStock(true);
	item2.setItemId(2L);
	item2.setPrice(346);
	
	Item item3 = new Item();
	item3.setItemName("Tv");
	item3.setBrand("LG");
	item3.setCategory("Electronics");
	item3.setImage("https://images.pexels.com/photos/2251206/pexels-photo-2251206.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500");
	item3.setInStock(true);
	item3.setItemId(3L);
	item3.setPrice(347);
	
	Item item4 = new Item();
	item4.setItemName("Tv");
	item4.setBrand("LG");
	item4.setCategory("Electronics");
	item4.setImage("https://images.pexels.com/photos/2251206/pexels-photo-2251206.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500");
	item4.setInStock(true);
	item4.setItemId(4L);
	item4.setPrice(348);
	
	Item item5 = new Item();
	item5.setItemName("Tv");
	item5.setBrand("LG");
	item5.setCategory("Electronics");
	item5.setImage("https://images.pexels.com/photos/2251206/pexels-photo-2251206.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500");
	item5.setInStock(true);
	item5.setItemId(5L);
	item5.setPrice(349);
	
	List<Item> items = new ArrayList<>();
	items.add(item1);
	items.add(item2);
	items.add(item3);
	items.add(item4);
	items.add(item5);
	
	ItemDetailsDto itemDetailsDto = new ItemDetailsDto();
	itemDetailsDto.setItems(items);
	itemDetailsDto.setNoOfItems(items.size());
	
	
	return itemDetailsDto;
	
	}

}
