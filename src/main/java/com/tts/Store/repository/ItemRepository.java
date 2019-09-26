package com.tts.Store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.Store.domain.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long>{

	@Query("from Item ORDER BY category")
	List<Item> findByCategory();
	
    @Query("from Item ORDER BY brand")
	List<Item> findByBrand();

}
