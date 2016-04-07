package com.quest.webapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Past;
import java.util.Date;


/**
 * Created by rodolfoagomes on 06/04/2016.
 */
@Entity
@Table(name="person")
public class Person {
	
	@Id
	@Column(name="pps_number")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ppsNumber;
	
	@Column(name="name", length=25)
	private String name;


	@Column(name="dt_birth")
	private Date dtBirth;
	
	@Column(name="mobile_number")
	private String mobileNumber;

	public Long getPpsNumber() {
		return ppsNumber;
	}

	public void setPpsNumber(Long ppsNumber) {
		this.ppsNumber = ppsNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDtBirth() {
		return dtBirth;
	}

	public void setDtBirth(Date dtBirth) {
		this.dtBirth = dtBirth;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
}
