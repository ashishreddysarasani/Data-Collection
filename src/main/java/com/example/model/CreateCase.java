package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCase {

	@Id
	private Integer caseid;
	private Integer appid;
	private Integer planid;
	
}
