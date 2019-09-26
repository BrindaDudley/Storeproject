package com.tts.Store.domain;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;

	@Entity
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	@Builder
	public class Item {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long itemId;
		private boolean inStock;
		private String category;
		private String brand;
		private String image;
<<<<<<< HEAD
		private double price;

=======
		private float price;
>>>>>>> modify itemservice, repo, controller
		

		@ManyToOne(fetch = FetchType.LAZY, optional = false)
		@OnDelete(action = OnDeleteAction.CASCADE)
		private User user;
		
		@NotEmpty(message = "Item name cannot be empty")
		private String itemName;
			
		@CreationTimestamp 
		private Date createdAt;
	}

