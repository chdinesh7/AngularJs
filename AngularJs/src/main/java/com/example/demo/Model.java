package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Model {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String empolyee;
	private String email;
	private String mobile;
	private String address;
	private String state;
	private String district;
	private String pin;
	
    Model(){
		
	 }
	Model(Long id,String empolyee,String email,String mobile,String address,String state,String district,String pin){
		this.id=id;
		this.empolyee=empolyee;
		this.email=email;
		this.mobile=mobile;
		this.address=address;
		this.state=state;
		this.district=district;
		this.pin=pin;
		
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpolyee() {
		return empolyee;
	}

	public void setEmpolyee(String empolyee) {
		this.empolyee = empolyee;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}


}
