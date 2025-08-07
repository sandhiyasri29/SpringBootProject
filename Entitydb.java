package com.example.SandhiyaDBB.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Database_table") 
public class Entitydb {
  @Id 
  @GeneratedValue(strategy=GenerationType.SEQUENCE)
  @Column(name="sn_no")
	private int s_no;
  @Column(name="sn_name")
	private String name;
  @Column(name="sn_depart")
	private String department;
  @Column(name="sn_email")
	private String email;
  public int getS_no() {
	return s_no;
  }
  public void setS_no(int s_no) {
	this.s_no = s_no;
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public String getDepartment() {
	return department;
  }
  public void setDepartment(String department) {
	this.department = department;
  }
  public String getEmail() {
	return email;
  }
  public void setEmail(String email) {
	this.email = email;
  }	
  
  
}
