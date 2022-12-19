package com.example.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	@Column(unique = true)
	String username;
	String password;
	@OneToMany(mappedBy = "user")
	List<Cellphone> cellphone;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Cellphone> getCellphone() {
		return cellphone;
	}
	public void setCellphone(List<Cellphone> cellphone) {
		this.cellphone = cellphone;
	}
	
	
	
}
