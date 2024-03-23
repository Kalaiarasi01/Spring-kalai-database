package com.spring.kalai.topic.course;




import com.spring.kalai.topic.Topic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {
	
	@Id
	private String id;
	private String name;
	private String descr;
	
	@ManyToOne
	private Topic topic;
	
	public Course() {//no-argument constructor
	}
	
	public Course(String id, String name, String desc,String topicId) {//parameter constructor
		super();
		this.id = id;
		this.name = name;
		this.descr = desc;
		this.setTopic(new Topic(topicId,"",""));
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

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic2) {
		this.topic = topic2;
	}

}