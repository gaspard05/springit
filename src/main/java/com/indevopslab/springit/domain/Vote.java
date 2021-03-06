package com.indevopslab.springit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Vote extends Auditable{

	@Id
	@GeneratedValue
	private Long id;
	private int vote;
	
	//Link
	//User
}
