package io.teena.userstore;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addId;
	
	private String city;
	
	@OneToOne(mappedBy = "address")
	private User users;
	
	public Address() {}
	
	public Integer getAddId() {
		return addId;
	}
	
	public void setAddId(Integer addId) {
		this.addId = addId;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public Address(String city) {
		this.city = city;
	}

}