package com.example.smartfleet.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // Helps lombok to generate all the getters and setters
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id") // this line prevents infinite recursion, needed when using @OneToMany relationship
public class State {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String capital;
	private String code;
	private String details;
	
	@ManyToOne // Making relationship with Country model
	@JoinColumn(name="countryid", insertable=false, updatable=false) // identifying the foreign key column to join between models
	private Country country;
	
	private Integer countryid; // foreign key

}
