package com.spring.kalai.topic;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class UserTes {
	
	@Mock
	private TopicRepository topicRepository;
	
	@Autowired
	private TopicService topicservice;

	@Test
	public void getTopictes() {
		when( topicRepository.findAll()).thenReturn( Stream.of(new Topic("102","Niresh","Interior"),new Topic("105","Nandhu","Assistant")).collect(Collectors.toList()));
		
		assertEquals(2,topicservice.getAllTopics().size());
		}

}
