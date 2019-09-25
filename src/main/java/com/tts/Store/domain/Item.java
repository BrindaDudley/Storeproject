package com.tts.Store.domain;

	import java.util.Set;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.ManyToMany;

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
		private String itemName;
		private boolean inStock;
		private String category;
		private String brand;
		private String image;
		private float price;

		

	}

