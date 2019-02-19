package com.indevopslab.springit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Comment extends Auditable{

	@Id
	@GeneratedValue
	private Long id;
	private String body;
	
	//Link
	@ManyToOne
	@NonNull
	private Link link;
}
