package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class EducationDetails {

	@Id
	private Integer caseid;
	private Integer graduationyear;
	private String highestdegree;
	private String universityname;
}
