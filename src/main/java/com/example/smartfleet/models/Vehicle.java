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
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data // Helps lombok to generate all the getters and setters
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id") // this line prevents infinite recursion, needed when using @OneToMany relationship
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String vehicleNumber;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date registrationDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date acquisitionDate;
	private String description;
	private String power;
	private String fuelCapacity;
	private String netWeight;
	private String remarks;
	
	@ManyToOne
	@JoinColumn(name="vehicletypeid", insertable=false, updatable=false)
	private VehicleType vehicleType;
	private Integer vehicletypeid;
	
	@ManyToOne
	@JoinColumn(name="vehiclemakeid", insertable=false, updatable=false)
	private VehicleMake vehicleMake;
	private Integer vehiclemakeid;

	@ManyToOne
	@JoinColumn(name="vehiclemodelid", insertable=false, updatable=false)
	private VehicleModel vehicleModel;
	private Integer vehiclemodelid;

	@ManyToOne
	@JoinColumn(name="vehiclestatusid", insertable=false, updatable=false)
	private VehicleStatus vehicleStatus;
	private Integer vehiclestatusid;
	
	@ManyToOne
	@JoinColumn(name="employeeid", insertable=false, updatable=false)
	private Employee inCharge;
	private Integer employeeid;
	
	@ManyToOne
	@JoinColumn(name="locationid", insertable=false, updatable=false)
	private Location currentLocation;
	private Integer locationid;
	
}
