package com.example.smartfleet.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

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
public class VehicleMaintenance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	private Date endDate;
	private String price;
	private String remarks;
	
	@ManyToOne // Making relationship with Country model
	@JoinColumn(name="vehicleid", insertable=false, updatable=false) // identifying the foreign key column to join between models
	private Vehicle vehicle;
	private Integer vehicleid; // foreign key

	
	@ManyToOne 
	@JoinColumn(name="supplierid", insertable=false, updatable=false) 
	private Supplier supplier;
	private Integer supplierid; // foreign key

}
