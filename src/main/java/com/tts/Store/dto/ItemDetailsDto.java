package com.tts.Store.dto;

import java.util.List;

import com.tts.Store.domain.Item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ItemDetailsDto {
	
	private List<Item> items;
	private int noOfItems;
	private int noOfRows;
	

}
