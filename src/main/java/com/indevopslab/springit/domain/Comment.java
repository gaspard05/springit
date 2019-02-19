package com.indevopslab.springit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Comment {

	@Id
	@GeneratedValue
	private Long id;
	private String body;
	
	//Link
}
