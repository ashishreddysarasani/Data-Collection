package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class KidsDetails {

	@Id
	private Integer caseid;
	private String kidname;
	private Integer kidage;
	private Integer kidssn;
	
}
