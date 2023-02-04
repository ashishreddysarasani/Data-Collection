package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class IncomeDetails {

	@Id
	private Integer caseid;
	private Integer monthlyincome;
	private Integer rentincome;
	private Integer propertyincome;
	
}
