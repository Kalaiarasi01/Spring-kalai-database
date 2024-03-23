package com.spring.kalai.topic.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Optional;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	/***private List<Course> courses=new ArrayList<>(Arrays.asList(
			new Course("102","Niresh","Interior"),
			new Course("103","Nandhu","Student"),
			new Course("104","Naveen","Engineer")
			));***/
	public List<Course> getAllcourses(String topicId){
		List<Course> courses=new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Optional<Course> getcourse(String id) {
		return courseRepository.findById(id);
		//return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}

	public void addcourse(Course course) {
		courseRepository.save(course);
		//topics.add(topic);
	}
	public void updatecourse(Course course) {
		courseRepository.save(course);;
		//topics.add(topic);
	}

	public void Deletecourse(String id) {
		courseRepository.deleteById(id);
		//topics.removeIf(t->t.getId().equals(id));
	}

}
