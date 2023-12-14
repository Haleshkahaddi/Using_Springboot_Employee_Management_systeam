package com.smart.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="CONTACT")
public class Contanct {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Cid;
  private	String Cname;
  private String SecondName;
  private String Work;
  private String EmailId;
  private String PhoneString;
  private String Emage;
  @Column(length=100)
  private String description;
  @ManyToOne
  private User User;
public int getCid() {
	return Cid;
}
public void setCid(int cid) {
	Cid = cid;
}
public String getCname() {
	return Cname;
}
public void setCname(String cname) {
	Cname = cname;
}
public String getSecondName() {
	return SecondName;
}
public void setSecondName(String secondName) {
	SecondName = secondName;
}
public String getWork() {
	return Work;
}
public void setWork(String work) {
	Work = work;
}
public String getEmailId() {
	return EmailId;
}
public void setEmailId(String emailId) {
	EmailId = emailId;
}
public String getPhoneString() {
	return PhoneString;
}
public void setPhoneString(String phoneString) {
	PhoneString = phoneString;
}
public String getEmage() {
	return Emage;
}
public void setEmage(String emage) {
	Emage = emage;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public User getUser() {
	return User;
}
public void setUser(User user) {
	User = user;
}
  
	

}
