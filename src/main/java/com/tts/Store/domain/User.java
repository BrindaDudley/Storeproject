package com.tts.Store.domain;

import java.sql.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	private String userName;
	private String email;
	private boolean active;
	private String password;
	private String firstName;
	private String lastName;

}
