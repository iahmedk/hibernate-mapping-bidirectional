package com.ty.mapping.bi.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Gst {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String gstNum;
	private String state;
	private String country;

	@OneToOne(mappedBy = "gst")
	private Company company;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGstNum() {
		return gstNum;
	}

	public void setGstNum(String gstNum) {
		this.gstNum = gstNum;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
