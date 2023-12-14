package com.smart.model;

import java.util.ArrayList;
import java.util.List;





import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="USER")
public class User{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private	int id;
	private	String Name;
	@Column(unique=true)
	private	String EmailId;
	private	String Password;
	private	int roll;
	private	boolean anebaled;
	private	String Emageurl;
	@Column(length=500)
	private	String about;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
private	List<Contanct>contact=new ArrayList<Contanct>();
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public boolean isAnebaled() {
		return anebaled;
	}
	public void setAnebaled(boolean anebaled) {
		this.anebaled = anebaled;
	}
	public String getEmageurl() {
		return Emageurl;
	}
	public void setEmageurl(String emageurl) {
		Emageurl = emageurl;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public List<Contanct> getContact() {
		return contact;
	}
	public void setContact(List<Contanct> contact) {
		this.contact = contact;
	}
 
}
