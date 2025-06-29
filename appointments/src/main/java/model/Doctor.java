package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "doctor")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Full_Name")
	private String name;
	
	@Column(name = "Specialization")
	private String specailization;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone_no")
	private int phoneNo;
	
	
}
