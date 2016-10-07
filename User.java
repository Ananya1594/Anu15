package com.store.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Register")
@Component
public class User {
	@Id
	private String name;
    private String mail;
    private String pass;
    private String confirm;
    private String contact;
 
    public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getMail(){
		return mail;
	}
	
	public void setMail(String mail){
		this.mail = mail;
	}
	
	public String getpassword(){
		return pass;
	}
	
	public void setpassword(String pass){
		this.pass = pass;
	}
	
	public String getconfirmpassword(){
		return confirm;
	}
	
	public void setconfirmpassword(String confirm){
		this.confirm = confirm;
	}
	
	public String getcontactnumber(){
		return contact;
	}
	
	public void setcontactnumber(String contact){
		this.contact = contact;
	}

}
