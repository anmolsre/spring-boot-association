package io.teena.userstore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Hobbies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hobId;
	private String hobbyName;
	
	@OneToOne
	@JoinColumn(name = "userId")
	private User user;
	
	public int getHobId() {
		return hobId;
	}
	public void setHobId(int hobId) {
		this.hobId = hobId;
	}
	public String getHobbyName() {
		return hobbyName;
	}
	public void setHobbyName(String hobbyName) {
		this.hobbyName = hobbyName;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
