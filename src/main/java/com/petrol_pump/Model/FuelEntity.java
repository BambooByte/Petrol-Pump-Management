package com.petrol_pump.Model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class FuelEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer fuelId;
	
	private String fuelName;
	
	private Long fuelQuantity;
	
	private Long fuelPrice;
	
	@CreationTimestamp
	private Date fuelAddedDate;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "admin_Id")
	private AdminEntity entity;
	@OneToOne(mappedBy = "fuelEntity")
	private CustomerEntity customerEntity;

}
