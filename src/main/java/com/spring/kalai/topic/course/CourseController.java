package com.spring.kalai.topic.course;

//import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.kalai.topic.Topic;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseservice;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllcourses(@PathVariable String id) {//it calls the function and converts the array as a JSON as a key:value pair.
		return courseservice.getAllcourses(id);
	}
	@RequestMapping("/topics/{topicId}/courses/{id}")//GET
	public Optional<Course> getcourse(@PathVariable String id) {
		return courseservice.getcourse(id);
	}
	
	@PostMapping( value="/topics/{topicId}/courses",consumes = MediaType.APPLICATION_JSON_VALUE)//post
	public  void addcourse(@RequestBody Course course,@PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseservice.addcourse(course);
	}
	
	@PutMapping(value="/topics/{topicId}/courses/{id}")//put
	public  void updatecourse(@RequestBody Course course,@PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseservice.updatecourse(course);
		 
	}
	
	@DeleteMapping(value="/topics/{topicId}/courses/{id}" )//DELETE
	public void Deletecourse(@PathVariable String id ) {
		courseservice.Deletecourse(id);	
	}

}