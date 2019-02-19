package com.indevopslab.springit.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
public class Link  extends Auditable{
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NonNull
	private String title;
	@NonNull
	private String url;
	
	//Comments
	@OneToMany(mappedBy="link")
	private List<Comment> comments = new ArrayList<>();

}
