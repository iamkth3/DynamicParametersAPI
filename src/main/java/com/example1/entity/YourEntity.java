package com.example1.entity;

//YourEntity.java

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class YourEntity {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String param1;
 private String param2;
 private String param3;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getParam1() {
	return param1;
}
public void setParam1(String param1) {
	this.param1 = param1;
}
public String getParam2() {
	return param2;
}
public void setParam2(String param2) {
	this.param2 = param2;
}
public String getParam3() {
	return param3;
}
public void setParam3(String param3) {
	this.param3 = param3;
}

 // getters and setters
 
 
}

