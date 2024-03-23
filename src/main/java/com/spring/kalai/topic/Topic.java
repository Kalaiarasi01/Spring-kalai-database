package com.spring.kalai.topic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Topic {
	
	@Id
	private String id;
	private String name;
	private String descr;
	
	public Topic() {//no-argument constructor
	}
	
	public Topic(String id, String name, String desc) {//parameter constructor
		super();
		this.id = id;
		this.name = name;
		this.descr = desc;
	}
	//getter and setter methods
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return descr;
	}
	public void setDesc(String desc) {
		this.descr = desc;
	}

}