package com.spring.kalai.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Optional;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	/***private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("102","Niresh","Interior"),
			new Topic("103","Nandhu","Student"),
			new Topic("104","Naveen","Engineer")
			));***/
	public List<Topic> getAllTopics(){
		List<Topic> topics=new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public void getTopic(String id) {
		topicRepository.findById(id);
		//return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
		//topics.add(topic);
	}

	public void DeleteTopic(String id) {
		topicRepository.deleteById(id);
		//topics.removeIf(t->t.getId().equals(id));
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);;
		//topics.add(topic);
	}

}
